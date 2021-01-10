/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author natas
 */


@WebServlet(name = "hello2", urlPatterns = {"/hello2"})
public class MyServlet extends HttpServlet {
    
     ArrayList<Profile> users = new ArrayList<Profile>();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // dataType for the user profile
    Profile profile = new Profile();
    users.add(profile); 
    
    
    public void doPost( 
        HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException
    {
        doGet(request, response);
    }        
            
    public void doGet(
    HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
    
    
    // getting and creating the session information
    
  /*  HttpSession session = request.getSession( );
    // dataType for the user profile - CHANGE THIS
    String [] profile_list = (String [])session.getAttribute("profiles");
    if (profile_list == null) {
        profile_list = new String(profile.length);
    }
*/
        out.println("<html><head><title> User Profile </title>" + "</head><body><p>");
    
        if (request.getParameter("name") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setName(request.getParameter("name"));
        else throw new ServletException("Please enter your name!");
        
        if (request.getParameter("age") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setAge(request.getParameter("age"));
        else throw new ServletException("Please enter your age!");
        
        if (request.getParameter("number") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setNumber(request.getParameter("number"));
        else throw new ServletException("Please enter your phone number!");
        
        if (request.getParameter("state") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setState(request.getParameter("state"));
        else throw new ServletException("Please enter your state!");
        
        if (request.getParameter("city") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setCity(request.getParameter("city"));
        else throw new ServletException("Please enter your city!");
        
        if (request.getParameter("pronouns") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setPronouns(request.getParameter("pronouns"));
        
        if (request.getParameter("prefs") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setPrefs(request.getParameter("prefs"));
    
        if (request.getParameter("profession") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setProfession(request.getParameter("profession"));
        else throw new ServletException("Please enter your profession!");
        
    
    } 
    
}
    
    
    
