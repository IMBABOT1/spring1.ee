package ru.geekbrains.spring1.lesson1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < 10; i++) {
            resp.getWriter().printf("<h1>Product" + new Product((long) i, "title:" + i, 10) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}

