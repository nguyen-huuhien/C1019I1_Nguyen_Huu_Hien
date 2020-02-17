import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet" , urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    float fistOperand = Integer.parseInt(request.getParameter("fist-operand"));
    float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
    char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result : </h1>");
        try {
            float result = Calculator.calculate(fistOperand,secondOperand,operator);
            writer.println(fistOperand + " "+operator+" " + secondOperand + " = " + result );

        } catch (Exception ex) {
            writer.println("error:" + ex.getMessage());
        }
    writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
