package club;
import java.util.*;
/*
This class keeps track of attendance by taking in an ArrayList 
of the members, as well as a date using the Date class
*/
public class Attendance {
    // The attributes of the class
    private ArrayList<Member> members;
    private Date date;
    
    // Constructor of the class, taking in an ArrayList and a Date
    public Attendance (ArrayList<Member> members, Date date) {
        this.date = date;
        this.members = members;
    }
    
    // Returns the arraylist of members
    public ArrayList<Member> getMembers() {
        return members;
    }
    
    // Sets the arraylist of members
    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
    
    // Returns the date
    public Date getDate() {
        return date;
    }
    
    // Sets the date
    public void setDate(Date date) {
        this.date = date;
    }
    
    // Overriding the toString method to print the number of members and the date
    @Override
    public String toString() {
        return "List of " + members.size() + (members.size() == 1 ? " member" : " members") + " for " + date.toString();
    }
    
    /* Overriding the equals method to check if every attribute
    is the same */
    @Override
    public boolean equals(Object obj) {
        // Checks if the object is null
        if (obj == null) {
            return false;
        }
        
        // Casting to Attendance object
        Attendance other = (Attendance) obj;
        
        if (members.equals(other.getMembers())) {
            if (date.equals(other.getDate())) {
                return true;
            }
        }
        return false;
    }
}