
    
    
    



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





 *
 * @author natas
 *//*
@WebServlet(name="userProfile", urlPatterns = {"/userProfile"})
public class userProfile extends HttpServlet {

  
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  /* protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* response.setContentType("text/html;charset=UTF-8");
       /* try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            // get name 
           /* String name = request.getParameter("Name");
           
            //get age 
            String age = request.getParameter("age");
            
            // get state 
            String state = request.getParameter("state");
     
            // get city 
            String city = request.getParameter("city");
            
            // get gender pronouns - from a list 
            String gender_pronouns = request.getParamater("pronouns");
            
            // get gender preferences
            String gender_prefs = request.getParamater("prefs");
                    
            // get profession
            String profession = request.getParameter("profession");
            
            // get phone number
            String number = request.getParameter("number");
            
            // get hobbies - change to checked boxes
            String hobbies = request.getParamater("hobbies");
          
            
            
           
            
            
        }
        
        
    }
     
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   /* @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


}
*/

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


@WebServlet(name = "userProfile", urlPatterns = {"/userProfile"})
public class userProfile extends HttpServlet {
    // dataType for the user profile
     public static Profile profile = new Profile();
     
     public ArrayList<Profile> users = new ArrayList<Profile>();
    

    
   
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
  
    
    @Override
    public void doPost( 
        HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException
    {
        doGet(request, response);
    }        
    
    @Override
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
        //out.println("<html><head><title> User Profile </title>" + "</head><body><p>");
    
        if (request.getParameter("name") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setName(request.getParameter("name"));
        //else throw new ServletException("Please enter your name!");
        
        if (request.getParameter("id") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setId(request.getParameter("id"));
        //else throw new ServletException("Please enter your name!");
        
        if (request.getParameter("age") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setAge(request.getParameter("age"));
        //else throw new ServletException("Please enter your age!");
        
        if (request.getParameter("number") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setNumber(request.getParameter("number"));
        //else throw new ServletException("Please enter your phone number!");
        
        if (request.getParameter("state") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setState(request.getParameter("state"));
        //else throw new ServletException("Please enter your state!");
        
        if (request.getParameter("city") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setCity(request.getParameter("city"));
        //else throw new ServletException("Please enter your city!");
        
        if (request.getParameter("pronouns") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setPronouns(request.getParameter("pronouns"));
        
        if (request.getParameter("prefs") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setPrefs(request.getParameter("prefs"));
    
        if (request.getParameter("profession") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setProfession(request.getParameter("profession"));
        //else throw new ServletException("Please enter your profession!");
        
         if (request.getParameter("type") != null)
            //out.println("<h1> Thank you for creating a profile!</h1>");
            profile.setType(request.getParameter("type"));
        //else throw new ServletException("Please enter your profession!");
        
         if (request.getParameter("roommate_type") != null) {
            //out.println("<h1> Thank you for creating a profile!</h1>");
             if(request.getParameter("roommate_type").equals("Already have a place to live"))
                profile.setRType(true);
             else profile.setRType(false);
         }
        //else throw new ServletException("Please enter your profession!");
        //out.println(profile.name);
        AddUsers(); 
        
        out.close(); 
        
    
    } 
    public void AddUsers(){
        users.add(profile);
    }
    
    public Profile getUser(){
        
        return profile; 
    }
    public ArrayList<Profile> getUsers(){
        return users; 
    }
   
    
 }
    

    
