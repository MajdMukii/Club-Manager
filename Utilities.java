package club;
import java.awt.Component;
import java.util.*;
import javax.swing.JOptionPane;
/*
This class is a QOL(quality of life) class that contains functions to 
make life easier
*/

public class Utilities {
    
    // Single static Scanner object, not used
    private static Scanner scn = new Scanner(System.in);
    
    private Utilities() {
        // private constructor to prevent creating objects
    }
    
    // A shortened version of System.out.println
    public static void print(Object obj) {
        System.out.println(obj);
    }
    
    // A shortened version of System.out.print
    public static void printToken(Object obj) {
        System.out.print(obj);
    }
    
    // Returns an int from user input
    public static int getInt() {
        return Integer.parseInt(scn.nextLine());
    }
    
    // Returns an int with a prompt message
    public static int getInt(String message) {
        printToken(message);
        return Integer.parseInt(scn.nextLine());
    }
    
    // Returns a double from user input
    public static double getDouble() {
        return Double.parseDouble(scn.nextLine());
    }
    
    // Returns a double with a prompt message
    public static double getDouble(String message) {
        printToken(message);
        return Double.parseDouble(scn.nextLine());
    }
    
    // Returns a String from user input
    public static String get() {
        return scn.nextLine();
    }
    
    // Returns a string with a prompt message
    public static String get(String message) {
        printToken(message);
        return scn.nextLine();
    }
    
    // This prints an arraylist without the square brackets
    // You can pass in any type of ArrayList, demonstrating polymorphic behaviour
    public static void printList(ArrayList<Object> list) {
        if (list.size() == 0) {
            print("This list is empty.");
        } else {
            print("Returning " + list.size() + " result" + (list.size() == 1 ? "." : "s."));
            list.forEach(System.out::println); 
        }
    }
    
    // Helper method to display a error dialog message 
    public static void showDialog(Component component, String message, String title) {
        JOptionPane.showMessageDialog(component, message, title, JOptionPane.ERROR_MESSAGE);
            
    }
    
    // Helper method to display a confirmation dialog message
    public static int showConfirmation(Component component, String message, String title) {
        return JOptionPane.showConfirmDialog(component, message, title, JOptionPane.YES_NO_OPTION);        
    }
    
    // This sorts a Student type list, given a key and the type of sort using linear sort
    public static int search(ArrayList<Student> list, String key, String type) {
        String element;
        for (int i = 0; i < list.size(); i++) {
            if (type.equals("First Name")) {
                element = list.get(i).getFirstName();                
            } else if (type.equals("Last Name")) {
                element = list.get(i).getLastName();
            } else if (type.equals("Student Number")) {
                element = "" + list.get(i).getStudentNumber();
            } else {
                element = ((Member) list.get(i)).getJoinDate().toString();
            }
            if (element.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }
    
    // This sorts a list of students, given just the type using bubble sort
    public static void sort(ArrayList<Student> list, String type) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swap = false;
            
            for (int x = 0; x < (list.size() - i) - 1; x++) {
                String current;
                String next;
                if (type.equals("First Name")) {
                   current = list.get(x).getFirstName();
                   next = list.get(x + 1).getFirstName();
                } else if (type.equals("Last Name")) {
                    current = list.get(x).getLastName();
                    next = list.get(x + 1).getLastName();
                } else if (type.equals("Student Number")) {
                    current = "" + list.get(x).getStudentNumber();
                    next = "" + list.get(x + 1).getStudentNumber();
                } else {
                    current = ((Member) list.get(x)).getJoinDate().toString();
                    next = ((Member) list.get(x + 1)).getJoinDate().toString();                    
                }
                if (current.compareTo(next) > 0) {
                    Student temp = list.get(x);
                    list.set(x, list.get(x + 1));
                    list.set(x + 1, temp);
                    swap = true;
                }
            }
            
            if (!swap) {
                break;
            }
        }
    }
    
    // This method searches a list of Events given a key and a boolean checking whether the date or bill is to be searched
    public static int search(ArrayList<Event> list, String key, boolean isDate) {
        String element;
        for (int i = 0; i < list.size(); i++) {
            if (isDate) {
                element = list.get(i).getDate().toString();
            } else {
                element = list.get(i).getBill().toString();
            }
            
            if (element.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }
    
    // This method searches a list of Bills given a key and an int - 0 for bill issuer and 1 for bill amount (price).  
    public static int search(ArrayList<Bill> list, String key, int code) {
        String element = "";
        for (int i = 0; i < list.size(); i++) {
            if (code == 0) {
                element = list.get(i).getBillIssuer();
            } else if (code == 1) {
                element = "" + list.get(i).getPrice();
            }
            
            if (element.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }    
    
    // This method searches Attendance lists to find the key based on the date
    public static int searchLists(ArrayList<Attendance> list, String key) {
        String element;
        for (int i = 0; i < list.size(); i++) {
            element = list.get(i).getDate().toString();
            if (element.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }
    
    // This method sorts events with a boolean for whether the user wants to sort by date or bill
    public static void sort(ArrayList<Event> list, boolean isDate) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swap = false;
            
            for (int x = 0; x < (list.size() - i) - 1; x++) {
                String current;
                String next;
                if (isDate) {
                   current = list.get(x).getDate().toString();
                   next = list.get(x + 1).getDate().toString();
                } else {
                    current = list.get(x).getBill().toString();
                    next = list.get(x + 1).getBill().toString();                  
                }
                if (current.compareTo(next) > 0) {
                    Event temp = list.get(x);
                    list.set(x, list.get(x + 1));
                    list.set(x + 1, temp);
                    swap = true;
                }
            }
            
            if (!swap) {
                break;
            }
        }
    }    

    
    
    
}