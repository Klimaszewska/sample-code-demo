package main;

import employee.Employee;
import employee.EmployeeGender;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "MainServlet", value = "/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("employeeList", employeeList());

        //RequestDispatcher used for linking the MainServlet class with the selected jsp file
        req.getRequestDispatcher("main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer employeeId = Integer.parseInt(req.getParameter("employeeId"));
        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        EmployeeGender gender = EmployeeGender.valueOf(req.getParameter("gender"));
        Date hireDate = Date.valueOf(req.getParameter("hireDate"));

        Employee employee = new Employee.EmployeeBuilder(employeeId, lastName).firstName(firstName).gender(gender).hireDate(hireDate).build();


        req.getRequestDispatcher("main.jsp").forward(req, resp);
    }

    private List<Employee> employeeList(){
        Employee employee1 = new Employee.EmployeeBuilder(1, "Kowalski").firstName("Jan").gender(EmployeeGender.M).hireDate(Date.valueOf("2016-01-08")).build();
        Employee employee2 = new Employee.EmployeeBuilder(2, "Nowak").firstName("Anna").gender(EmployeeGender.F).hireDate(Date.valueOf("2016-01-01")).build();
        Employee employee3 = new Employee.EmployeeBuilder(3, "Johnson").firstName("Thomas").gender(EmployeeGender.M).hireDate(Date.valueOf("2017-03-02")).build();
        Employee employee4 = new Employee.EmployeeBuilder(4, "Jacobsen").firstName("Eric").gender(EmployeeGender.X).hireDate(Date.valueOf("2018-03-20")).build();
        Employee employee5 = new Employee.EmployeeBuilder(5, "Bruege").firstName("Katherine").build();
        Employee employee6 = new Employee.EmployeeBuilder(6, "Cooper").firstName("Andrew").build();
        Employee employee7 = new Employee.EmployeeBuilder(7, "Mark").firstName("Adan").build();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);

        return employeeList;
    }

}
