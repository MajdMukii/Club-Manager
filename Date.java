package club;

import java.time.*;

/*
This class keeps track of the date by taking in the year, month,
and the day and storing as a LocalDate which is part of the Java API
*/
public class Date {
    // The attributes of the class
    private LocalDate date;
    
    
    // Constructor of the class
    public Date (int month, int day, int year) {
        try {
            date = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw e; // If an invalid day is passed, throw an exception to the caller
        }
    }
    
    // Return the LocalDate attribute
    public LocalDate getDate() {
        return date;
    }
    
    // Returns the year of the LocalDate
    public int getYear() {
        return date.getYear();
    }
    
    // Returns the month of the LocalYear
    public int getMonth() {
        return date.getMonth().getValue();
    }
    
    // Returns the day-of-month of the LocalDate
    public int getDay() {
        return date.getDayOfMonth();
    }
    
    // Sets the year of the LocalDate
    public void setYear(int year) {
        date = date.withYear(year);
    }
    
    // Sets the month of the LocalDate
    public void setMonth(int month) {
        date = date.withMonth(month);
    }
    
    // Sets the day-of-month of the LocalDate
    public void setDay(int day) {
        date = date.withDayOfMonth(day);
    }
    
    // For the above set methods, if an invalid value is passed, the Date will be stored to a correct value
    
    // Overriding the toString method to print the LocalDate in its native toString() format
    @Override
    public String toString() {
        return date.toString();
    }
    
    /* Overriding the equals method to check if each contained LocalDate
    is the same */
    @Override
    public boolean equals(Object obj) {
        // Checks if the object is null
        if (obj == null) {
            return false;
        }
        
        // Casting to Date object
        Date other = (Date) obj;
        
        if (this.date.equals(other.getDate())) {
            return true;
        } else {
            return false;
        }
    }
}