/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Object;
import java.lang.Math;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author elifc
 */
@WebServlet(name="SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {
    public String userID; 
    ArrayList<Profile> users = new ArrayList<Profile>();
    //Profile currentUser=new Profile(); 
    
    Profile match=new Profile(); 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public SearchServlet(){
        Users usersObj=new Users(); 
        userProfile profile=new userProfile(); 
        //currentUser=profile.getUser(); 
        users=usersObj.createUsers();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        match=findMatch(); 
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if(match == null){
                out.println("No matches were found :(");
                //out.println(userProfile.profile.getName());
                
                
                //out.println("test1");
                
            }
            else {
                out.println(match.name);
              
                out.println(match.number);
            }
            
            
            //write code to input id from user
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        request.setAttribute("sharedId", "name"); // add to request
        request.getSession().setAttribute("sharedId", "name"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "name"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "age"); // add to request
        request.getSession().setAttribute("sharedId", "age"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "age"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "number"); // add to request
        request.getSession().setAttribute("sharedId", "number"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "number"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "state"); // add to request
        request.getSession().setAttribute("sharedId", "state"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "state"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "city"); // add to request
        request.getSession().setAttribute("sharedId", "city"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "city"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "pronouns"); // add to request
        request.getSession().setAttribute("sharedId", "pronouns"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "pronouns"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "profession"); // add to request
        request.getSession().setAttribute("sharedId", "profession"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "profession"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
        
        request.setAttribute("sharedId", "prefs"); // add to request
        request.getSession().setAttribute("sharedId", "prefs"); // add to session
        this.getServletConfig().getServletContext().setAttribute("sharedId", "prefs"); // add to application context
        request.getRequestDispatcher("/userProfile").forward(request, response);
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    
    int user_len = users.size();
    public Profile findMatch(){
        
        
        
        //Profile matched=new Profile(); 
        //matched=idMatcher(id); 
        for(int i=0; i<user_len; i++){
            if (users.get(i).getState().equals(userProfile.profile.getState()) && users.get(i).getCity().equals(userProfile.profile.getCity())) {
                int age1 = Integer.parseInt(users.get(i).getAge());
                int age2 = Integer.parseInt(userProfile.profile.getAge());
                int difference = age1 - age2;
                if (Math.abs(difference) <= 2) {
                    if (users.get(i).getPronouns().equals(userProfile.profile.getPrefs())) {
                        return users.get(i); 
                    }
                }
            }
               //return currentUser; 
            
            
               
            }
        
       
        
         
        return null;
        }
    
        
    

         
    

    }


    
    

