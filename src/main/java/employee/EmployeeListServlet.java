package employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "EmployeeListServlet", value = "/displayEmployees")
public class EmployeeListServlet extends HttpServlet {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("employeeList", employeeRepository.getListOfAllEmployees());
        req.getRequestDispatcher("displayEmployees.jsp").forward(req, resp);
    }
}
