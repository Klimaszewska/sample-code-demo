package deleteEmployee;

import employee.EmployeeRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "DeleteEmployeeServlet", value = "/delete")
public class DeleteEmployeeServlet extends HttpServlet {

    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int employeeId = Integer.parseInt(req.getParameter("employeeId"));
        employeeRepository.deleteEmployee(employeeId);
        resp.sendRedirect("/displayEmployee");
    }
}
