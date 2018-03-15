package addEmployee;

import employee.Employee;
import employee.EmployeeGender;
import employee.EmployeeRepository;
import utilities.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet (name = "AddEmployeeServlet", value = "/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //RequestDispatcher used for linking the AddEmployeeServlet class with the selected jsp file
        req.getRequestDispatcher("addEmployee.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

/*        Integer employeeId = Integer.parseInt(req.getParameter("employeeId"));*/
        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        EmployeeGender gender = EmployeeGender.valueOf(req.getParameter("gender"));
        Date hireDate = Date.valueOf(req.getParameter("hireDate"));

        Employee employee = new Employee.EmployeeBuilder(lastName, firstName).gender(gender).hireDate(hireDate).build();

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.addPEmployee(HibernateUtil.getSessionFactory(), employee);

        req.getRequestDispatcher("addEmployee.jsp").forward(req, resp);
    }

}
