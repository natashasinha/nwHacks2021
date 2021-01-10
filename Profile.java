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
    
    private String name; 
    private String number; 
    private String age; 
    private String pronouns; 
    private String state; 
    private String city; 
    private String prefs; 
    private String profession; 
    private String hobbies; 
    
    public Profile(String name, String number, String age,String pronouns, String state, String city, String prefs, String profession, String hobbies) {
      this.name = name;
      this.number = number;
      this.age=age; 
      this.pronouns=pronouns; 
      this.state=state; 
      this.city=city; 
      this.prefs=prefs; 
      this.profession=profession; 
      this.hobbies=hobbies; 
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
       public String getHobbies() { return hobbies; }
       // setter

       public void setName(String name) { this.name = name; }
       public void setNumber(String number) { this.number = number; }
       public void setAge(String age) { this.age = age; }
       public void setCity(String city) { this.city = city; }
       public void setState(String state) { this.state = state; }
       public void setPrefs(String prefs) { this.prefs = prefs; }
       public void setPronous(String pronouns) { this.pronouns = pronouns; }
       public void setProfession(String profession) { this.profession = profession; }
       public void setHobbies(String hobbies) { this.hobbies = hobbies; }
    
}
