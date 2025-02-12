package club;

/* This class will keep track of bills, including the price 
and who issued the bill.
*/
public class Bill {
    // The attributes of the class
    private double price;
    private String billIssuer;
    
    // Constructor for the class
    public Bill (double price, String billIssuer) {
        this.price = price;
        this.billIssuer = billIssuer;
    }
    
    // Overloading the constructor for cases where the price is 0 (free)
    public Bill (String billIssuer) {
        price = 0.0;
        this.billIssuer = billIssuer;
    }
    
    // Returns the price
    public double getPrice() {
        return price;
    }
    
    // Sets the price
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Returns who issued the bill
    public String getBillIssuer() {
        return billIssuer;
    }
    
    // Sets who issued the bill
    public void setBillIssuer(String billIssuer) {
        this.billIssuer = billIssuer;
    }
    
    // Overriding the toString method to print what we want
    @Override
    public String toString() {
        return "Price: " + price + " Issuer: " + billIssuer;
    }
    
    /* Overriding the equals method to check if every attribute
    is the same */
    @Override
    public boolean equals(Object obj) {
        // Checks if the object is null
        if (obj == null) {
            return false;
        }
        
        // Casting to Bill object
        Bill other = (Bill) obj;
        
        if (this.price == other.getPrice()) {
            if (this.billIssuer.equals(other.getBillIssuer())) {
                return true;
            }
        }
        return false;
    }
    
}