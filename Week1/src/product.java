public class product {
    double price;

    void setPrice(double price){
        this.price=price;
    }
   double getPrice(int quantity){
        return (price*quantity);
    }
    double getPrice(double quantity){
        return (this.price*quantity);
    }
    double getPrice(float quantity){
        return  (this.price*quantity);
    }
}
