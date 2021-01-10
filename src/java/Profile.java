
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elifc
 */
public class Profile {
    //ArrayList<Profile> users = new ArrayList<Profile>();
    
    public String name; 
    public String number; 
    public String age; 
    public String pronouns; 
    public String state; 
    public String city; 
    public String prefs; 
    public String profession;
    public String type; //apt or house? 
    public boolean roommate_type; //if they have a place to live or not
    public String id;
    
    public Profile() {
        String name; 
        String number; 
        String age; 
        String pronouns; 
        String state; 
        String city; 
        String prefs; 
        String profession; 
        String type; 
        boolean roommate_type; 
        String id; 
      
   }

       // getter
       public String getName() { return name; }
       public String getNumber() { return number; }
       public String getAge() { return age; }
       public String getCity() { return city; }
       public String getState() { return state; }
       public String getPrefs() { return prefs; }
       public String getPronouns() { return pronouns; }
       public String getProfession() { return profession; }
       public String getId() { return id; }
       // setter

       public void setName(String name) { this.name = name; }
       public void setNumber(String number) { this.number = number; }
       public void setAge(String age) { this.age = age; }
       public void setCity(String city) { this.city = city; }
       public void setState(String state) { this.state = state; }
       public void setPrefs(String prefs) { this.prefs = prefs; }
       public void setPronouns(String pronouns) { this.pronouns = pronouns; }
       public void setProfession(String profession) { this.profession = profession; }
       public void setId(String id) { this.id = id; }
       public String getType(){
        return type;
    }
    public boolean getRoommateType(){
        return roommate_type;
    }
    
    public void setRType(boolean type){
        roommate_type=type; 
    }
    
    public void setType(String type){
        this.type=type; 
    }
    
}