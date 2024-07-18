package com.dhls.servlet;

import java.io.IOException;

import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class HealthCheckServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            resp.getWriter().println("Ok");
        }catch(IOException e) {
            throw new ServletException(e);
        }
    }
}
