
package price;


public class Price {
    private int quantity;
    private double unitPrice;

    public Price() {
    }

    public Price(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public void calculateTotalPrice(int n1,double n2) {
        int totalPrice=quantity*(int)unitPrice;
        System.out.println("The total price is "+totalPrice);
        double discount=totalPrice*0.05;
        if(totalPrice>=100){
            System.out.println("you hava to pay with discount "+(totalPrice-discount));
            System.out.println("The discount is "+discount);
        }
        else{
            System.out.println("you have to pay without discount "+totalPrice);
            System.out.println("The discount is 0");
        }
        
        
    }
    
    
}
