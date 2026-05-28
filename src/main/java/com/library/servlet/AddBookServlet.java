package com.library.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.library.model.Book;
import com.library.dao.BookDAO;


@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {

    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {

        String name = request.getParameter("name");
        String author = request.getParameter("author");
        int quantity =
            Integer.parseInt(request.getParameter("quantity"));

        Book b = new Book();

        b.setName(name);
        b.setAuthor(author);
        b.setQuantity(quantity);
    
        int status = BookDAO.save(b);
    
        if(status > 0) {

            response.sendRedirect("viewBooks.jsp");

        } else {

            response.getWriter().println("Failed to Add Book");
        }
    }
}
        
