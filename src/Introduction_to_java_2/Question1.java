package Introduction_to_java_2; 
enum HouseType {
    VILLA(5000000),
    APARTMENT(2000000),
    BUNGALOW(3500000),
    DUPLEX(3000000);

    private final int price;

    
    HouseType(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }
}
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Available House Types and their Prices:\n");

        for (HouseType house : HouseType.values()) {
            System.out.println(house + " costs ₹" + house.getPrice());
        }
    }
}
