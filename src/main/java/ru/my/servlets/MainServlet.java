package ru.my.servlets;

import ru.my.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Milk")
                , new Product(2, "Chocolate"), new Product(3, "Bear")));
        req.setAttribute("products", products);
        req.setAttribute("firstColName", "Position");
        req.setAttribute("secondColName", "Name");
        req.setAttribute("thirdColName", "Action");
        req.setAttribute("nameButtonAdd", "Add");
        req.setAttribute("nameButtonSort", "Sort");
        req.setAttribute("nameButtonMoveDown", "Move down");
        req.setAttribute("nameButtonMoveUp", "Move up");
        req.setAttribute("nameButtonRemove", "Remove");
        req.getRequestDispatcher("mypage.jsp").forward(req, resp);
    }
}
