
package vehicle;




public class Truck extends Vehicle {
    public int weight;

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; 
        } else {
            return regularPrice;
        }
    }
}
