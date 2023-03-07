package etu001799.framework.servlet;


import etu001799.framework.Mapping;


import java.io.*;
import java.util.HashMap;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FrontServlet extends HttpServlet {
    HashMap<String,Mapping> mappinUrls;

    public FrontServlet(HashMap<String, Mapping> mappinUrls) {
        this.mappinUrls = mappinUrls;
    }

    public void setMappinUrls(HashMap<String, Mapping> mappinUrls) {
        this.mappinUrls = mappinUrls;
    }

    public HashMap<String, Mapping> getMappinUrls() {
        return mappinUrls;
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    }
    
}
