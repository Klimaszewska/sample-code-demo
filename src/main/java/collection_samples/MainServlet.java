package collection_samples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "MainServlet", value = "/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //RequestDispatcher used for linking the MainServlet class with the selected jsp file
        req.getRequestDispatcher("main.jsp").forward(req, resp);
    }

    //TODO: implement the method below
    private List<Employee> createEmployeeList(){
        Employee employee1 = new Employee.EmployeeBuilder(1, "Kowalski").firstName("Jan").gender(EmployeeGender.M).build();
        List<Employee> employeeList = new ArrayList<Employee>();


        return employeeList;
    }

}
