package club;
/*
This class is a parent class of the member class, which keeps track of 
the students first name, last name, their grade, and their student number
*/
public class Student {
    // The attributes of the class
    protected String firstName;
    protected String lastName;
    protected int grade;
    protected int studentNumber;
    
    // Constructor of the class
    public Student(String firstName, String lastName, int grade, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }
    
    // Returns the student's first name
    public String getFirstName() {
        return firstName;
    }
    
    // Sets the student's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // Returns the student's last name
    public String getLastName() {
        return lastName;
    }
    
    // Sets the student's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // Returns which grade the student is in
    public int getGrade() {
        return grade;
    }
    
    // Sets which grade the studen is in
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    // Returns the student number
    public int getStudentNumber() {
        return studentNumber;
    }
    
    // Sets the student number
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    // Returns the student's initials
    public String getInitials() {
        return firstName.substring(0, 1) + lastName.substring(0, 1);
    }
    
    /* No setInitials because the initials are recieved from the student's 
    first and last name
    */
    
    // Overriding the toString method to print what we want
    @Override
    public String toString() {
        return firstName + ", " + lastName + " | Grade " + grade + " | Student #" + studentNumber;
    }
    
    /* Overriding the equals method to check if every attribute
    is the same */
    @Override
    public boolean equals(Object obj) {
        // Checks if the object is null
        if (obj == null) {
            return false;
        }
        
        // Casting to Student object
        Student other = (Student) obj;
        
        if (firstName.equals(other.getFirstName())) {
            if (lastName.equals(other.getLastName())) {
                if (grade == other.getGrade()) {
                    if (studentNumber == other.getStudentNumber()) {
                        return true;
                    }
                }
            }
            
        }
        return false;
    }
    
}