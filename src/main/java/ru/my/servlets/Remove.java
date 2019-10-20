package ru.my.servlets;

import ru.my.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/remove")
public class Remove extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer position = Integer.parseInt( req.getParameter("position"));
        String name = req.getParameter("name");
        Main.productDAO.remove(new Product(position, name));
        new Main().doGet(req, resp);
    }
}
