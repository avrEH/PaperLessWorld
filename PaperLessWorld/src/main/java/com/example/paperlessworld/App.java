package com.example.paperlessworld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class App extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<html><head><title>PaperLess World</title></head><body>");
        resp.getWriter().write("<h1>Welcome to PaperLess World!</h1>");
        resp.getWriter().write("<script src='script.js'></script>");
        resp.getWriter().write("</body></html>");
    }
}
