package main;

import employee.Employee;
import employee.EmployeeGender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utilities.HibernateUtil;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        try(SessionFactory factory = HibernateUtil.getSessionFactory()){
            try (Session session = factory.openSession()) {
                Transaction trans = null;
                try {
                    trans = session.beginTransaction();
                    List<Employee> allEmployees = createListOfEmployees();
                    allEmployees.forEach(session::save);
                    trans.commit();
                } catch (RuntimeException e) {
                    if (trans != null) {
                        trans.rollback();
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static List<Employee> createListOfEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee.EmployeeBuilder(1, "Kowalski").firstName("Jan").gender(EmployeeGender.M).hireDate(Date.valueOf("2016-01-08")).build());
        employeeList.add(new Employee.EmployeeBuilder(2, "Nowak").firstName("Anna").gender(EmployeeGender.F).hireDate(Date.valueOf("2016-01-01")).build());
        employeeList.add(new Employee.EmployeeBuilder(3, "Johnson").firstName("Thomas").gender(EmployeeGender.M).hireDate(Date.valueOf("2017-03-02")).build());
        employeeList.add(new Employee.EmployeeBuilder(4, "Jacobsen").firstName("Eric").gender(EmployeeGender.X).hireDate(Date.valueOf("2018-03-20")).build());
        employeeList.add(new Employee.EmployeeBuilder(5, "Bruege").firstName("Katherine").build());
        employeeList.add(new Employee.EmployeeBuilder(6, "Cooper").firstName("Andrew").build());
        employeeList.add(new Employee.EmployeeBuilder(7, "Mark").firstName("Adan").build());
    return employeeList;
    }
}
