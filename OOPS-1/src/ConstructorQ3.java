// Write a class for product and customer.

class Product{
    private String itemNo;
    private String Name;
    private double Price;
    private int Quantity;

    public String getName(){
        return Name;
    }

    public String getItemNo(){
        return itemNo;
    }

    public double getPrice(){
        return Price;
    }

    public void setPrice(int P){
        Price = P;
    }

    public double getQuantity(){
        return Price;
    }

    public void setQuantity(int Q){
        Price = Q;
    }

    // Now, Lets Give some Constructor for the Product Class

    public Product(){
        itemNo = "Null";
    }

    public Product(String itno){
        itemNo = itno;
    }

    public Product(String itno, String name){
        itemNo = itno;
        Name = name;
    }

    public Product(String itno, String name, double Pr, int Qt){
        itemNo = itno;
        Name = name;
        Price = Pr;
        Quantity = Qt;

    }

}

// Let's Create a class for customer

class Customer{
    String CustomerID;
    String Name;
    String Address;
    int PhnNo;

    public Customer(){
        CustomerID = "Null";
    }

    public Customer(String Name){
        this.Name = Name;
    }
    public Customer(String Name, String Address){
        this.Address = Address;
    }


    public String getCustomerID(){
        return CustomerID;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
    public int getPhnNo(){
        return PhnNo;
    }

    public void setAddress(String Add){
        Address = Add;
    }
    public void setPhnNo(int Phn){
        PhnNo = Phn;
    }

}

public class ConstructorQ3 {
    public static void main(String[] args) {
        Product Prt = new Product();
        Customer cr = new Customer();

        Prt.setPrice(100);
        Prt.setQuantity(5);

        cr.setAddress("ABCD");
        cr.setPhnNo(855555145);

    }
}
