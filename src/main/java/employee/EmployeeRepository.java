package employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utilities.HibernateUtil;

import java.util.List;

public class EmployeeRepository {

    public Employee getEmployee(int employeeId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.get(Employee.class, employeeId);
    }

   public void addPEmployee(SessionFactory sessionFactory, Employee employee){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = null;
            try{
                transaction = session.beginTransaction();
                session.save(employee);
                transaction.commit();
            }catch(RuntimeException e){
                if (transaction != null){
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
   }

    public void deleteEmployee (int employeeId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                session.delete(getEmployee(employeeId));
                transaction.commit();
            } catch (RuntimeException e) {
                if (transaction != null) {
                    transaction.rollback();
                    e.printStackTrace();
                }
            }
        }
    }

   public List <Employee> getListOfAllEmployees(){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query <Employee> employeeQuery = session.createQuery("FROM Employee");
       employeeQuery.getResultList().forEach(System.out::println);
       return employeeQuery.getResultList();
   }

}
