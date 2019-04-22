import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Author:lorrie
 * Create:2019/4/21
 */
@WebServlet(name = "Servlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getMethod();
        String host=request.getHeader("host");
        Enumeration<String> names=request.getHeaderNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            response.getWriter().write(request.getHeader(name));
            System.out.println(name+request.getParameter(name));
        }
    }
}
