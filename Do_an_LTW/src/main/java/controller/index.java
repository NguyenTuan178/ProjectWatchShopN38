package controller;

import bean.Product;
import enity.ProductEntity;
import enity.ProductMan;
import enity.ProductNew;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "index",  urlPatterns = "/index")
public class index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<Product> values = new ProductEntity().gettAll();
        request.setAttribute("List",values);
        Collection<Product> productnew  = new ProductNew().getProductNew();
        request.setAttribute("ProductNew", productnew);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

}
