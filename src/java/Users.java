/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elifc
 */

import java.util.*; 

public class Users {
    
    public ArrayList<Profile> createUsers(){
        Profile user1 = new Profile();
 
        user1.name = "Natasha Sinha";
        user1.age = "21";
        user1.pronouns = "She/her/hers";
        user1.state = "Minnesota";
        user1.city = "Minneapolis"; 
        user1.prefs = "She/her/hers";
        user1.profession = "Student";
        user1.type = "Apartment";
        user1.roommate_type = false;
        user1.id="natty";
        
        Profile user2 = new Profile();

        user2.name = "Elif Cetin";
        user2.age = "35"; 
        user2.pronouns = "She/her/hers";
        user2.state = "Minnesota";
        user2.city = "Minneapolis";
        user2.prefs = "She/her/hers";
        user2.profession = "Professor";
        user2.type = "House";
        user2.roommate_type = false; 
        user2.id = "112";
        
        Profile user3 = new Profile();

        user3.name = "Justin Trudeau";
        user3.age = "22"; 
        user3.pronouns = "He/him/his";
        user3.state = "Illinois";
        user3.city = "Chicago";
        user3.prefs = "Other";
        user3.profession = "Student";
        user3.type = "House";
        user3.roommate_type = true; 
        user3.id = "j1729";
        
        Profile user4 = new Profile();

        user4.name = "Natalie Olson";
        user4.age = "25"; 
        user4.pronouns = "She/her/hers";
        user4.state = "Minnesota";
        user4.city = "Minneapolis";
        user4.prefs = "She/her/hers";
        user4.profession = "Student";
        user4.type = "House";
        user4.roommate_type = true; 
        user4.id = "olso435";
        
        Profile user5 = new Profile();

        user5.name = "Jacob Collinge";
        user5.age = "24";
        user5.pronouns = "He/him/his";
        user5.state = "Minnesota";
        user5.city = "St. Paul";
        user5.prefs = "He/him/his";
        user5.profession = "Chef";
        user5.type = "House";
        user5.roommate_type = false;
        user5.id = "colli243";
        
         Profile user6 = new Profile();

        user6.name = "Amanda Steinmetz";
        user6.age = "20";
        user6.pronouns = "They/their/them";
        user6.state = "Wisconsin";
        user6.city = "Middleton";
        user6.prefs = "They/their/them";
        user6.profession = "Student";
        user6.type = "House";
        user6.roommate_type = false;
        user6.id = "stein093";
        
        userProfile userprofiles = new userProfile(); 
        
        ArrayList<Profile> users= userprofiles.getUsers(); 
        
        users.add(user1); 
        users.add(user2); 
        users.add(user3); 
        users.add(user4); 
        users.add(user5); 
        users.add(user6); 
        return users; 
        
        
        
    }
    
}
