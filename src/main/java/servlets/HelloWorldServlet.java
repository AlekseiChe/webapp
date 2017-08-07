package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by aleksei on 27.07.17.
 */

@WebServlet("localhost:/me")
public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<body style=\"background:#80BFFF\">");
        printWriter.println("<H1>Hello, world! или Привет мир</H1>");
        printWriter.println("<H3>ПОЛУЧИЛОСЬ</H3>");
        printWriter.println("<H0>ТЕПЕРЬ Я МОГУ СДЕЛАТЬ СВОЙ САЙТ</H0>");
    }
}
