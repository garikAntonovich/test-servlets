package by.iharantanovich.testservlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<String> messages = new ArrayList<>();
        messages.add("Good Morning!");
        messages.add("Good Day!");
        messages.add("Good Evening!");
        messages.add("Good Night!");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (String message : messages) {
            out.println("<h2>" + message + "</h2>");
        }
        out.println("</body></html>");
    }
}