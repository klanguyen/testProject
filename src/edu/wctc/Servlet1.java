package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet1", urlPatterns = "/hello")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String myTea = request.getParameter("favTea");
        String message = "<html><body>Why do you like " + myTea + " that much?</body></html>";
        response.getWriter().print(message);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String myDino = request.getParameter("favDino");

        String message = "<html><body>You said: "
                + myDino
                + "</body></html>";

        response.getWriter().print(message);
    }
}
