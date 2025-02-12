package club;
/*
This class is a child class of the Student class which keeps track of the day they joined, and their experience
*/
public class Member extends Student {
    // The attributes of the class
    protected Date joinDate;
    protected int experience;
    
    // Constructor of the class
    public Member(String firstName, String lastName, int grade, int studentNumber, Date joinDate, int experience) {
        super(firstName, lastName, grade, studentNumber);
        this.joinDate = joinDate;
        this.experience = experience;
    }
    
    // Overloaded contructor that takes a pre-exsisting Student object
    public Member(Student student, Date joinDate, int experience) {
        super(student.getFirstName(), student.getLastName(), student.getGrade(), student.getStudentNumber());
        this.joinDate = joinDate;
        this.experience = experience;
    }
  
    // Returns the join date of the member
    public Date getJoinDate() {
        return joinDate;
    }
    
    // Sets the join date of the member
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    
    // Returns the experience, in years, of the member
    public int getExperience() {
        return experience;
    }
    
    // Sets the experience, in years, of the member
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    // Overriding the toString method to the attributes of the student
    @Override
    public String toString() {
        String temp = firstName;
        temp += " | Join Date: " + joinDate + " | Experience: " + experience;
        return temp;
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
        
        if (super.equals(other)) {
            Member otherMember = (Member) other;
            if (joinDate.equals(otherMember.getJoinDate())) {
                if (experience == otherMember.getExperience()) {
                    return true;
                }
            }
        }
        return false;
    } 

}