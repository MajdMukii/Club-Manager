package club;
/*
This class keeps track of events by taking in the description of the event,
the date it happened, and the bill, if there was one, that was for the event
*/

public class Event {
    // The attributes of the class
    private String description;
    private Date date;
    private Bill bill;
    
    // Constructor of the class
    public Event (String description, Date date, Bill bill) {
        this.description = description;
        this.date = date;
        this.bill = bill;
    }
    
    // Overloaded constructor incase the event was free and no bill was issued
    public Event (String description, Date date) {
        this.description = description;
        this.date = date;
        bill = new Bill(0.0, "None");
    }
    
    
    // Returns the event description
    public String getDescription() {
        return description;
    }
    
    // Sets the event description
    public void setDescription(String description) {
        this.description = description;
    }
    
    // Returns the date
    public Date getDate() {
        return date;
    }
    
    // Sets the date
    public void setDate(Date date) {
        this.date = date;
    }
    
    // Returns the bill
    public Bill getBill() {
        return bill;
    }
    
    // Sets the bill
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    
    // Overriding the toString method to the description and date
    @Override
    public String toString() {
        return (description + " at " + date);
    }
    
    /* Overriding the equals method to check if every attribute
    is the same */
    @Override
    public boolean equals(Object obj) {
        // Checks if the object is null
        if (obj == null) {
            return false;
        }
        
        // Casting to Event object
        Event other = (Event) obj;
        
        if (description == other.getDescription()) {
            if (date.equals(other.getDate())) {
                if (bill.equals(other.getBill())) {
                    return true;
                }
            }
        }
        return false;
    }
}