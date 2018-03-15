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
        employeeList.add(new Employee.EmployeeBuilder("Kowalski", "Marian").gender(EmployeeGender.M).hireDate(Date.valueOf("2016-01-08")).build());
        employeeList.add(new Employee.EmployeeBuilder("Nowak", "Anna").gender(EmployeeGender.F).hireDate(Date.valueOf("2016-01-01")).build());
        employeeList.add(new Employee.EmployeeBuilder("Jacobsen", "Eric").gender(EmployeeGender.X).hireDate(Date.valueOf("2018-03-20")).build());
        employeeList.add(new Employee.EmployeeBuilder("Bruege", "Kate").gender(EmployeeGender.F).build());
        employeeList.add(new Employee.EmployeeBuilder("Cooper", "Mark").build());
        employeeList.add(new Employee.EmployeeBuilder("Mark", "Stephanie").build());
    return employeeList;
    }
}
