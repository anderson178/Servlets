package ru.my.servlets;

import ru.my.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer position = Integer.parseInt( req.getParameter("position"));
        String name = req.getParameter("name");
        MainServlet.productDAO.add(new Product(position, name));
        new MainServlet().doGet(req, resp);
    }
}
