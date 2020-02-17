import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "produc_discount", urlPatterns = "/discount_calculator")
public class produc_discount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String product_Description = request.getParameter("description");
    float lastPrice = Float.parseFloat(request.getParameter("price"));
    float discount = Float.parseFloat(request.getParameter("discount"));
    float discountAmount = (float) (lastPrice*discount*0.1);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> product description :" + product_Description + "</h1>");
        writer.println("<h1> Discount percent:" + discount + "</h1>");
        writer.println("<h1> price :" + lastPrice + "</h1>");
        writer.println("<h1> discount amount :" + discountAmount + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
