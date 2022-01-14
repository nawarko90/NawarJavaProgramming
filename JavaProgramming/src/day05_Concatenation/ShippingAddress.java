package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Nawar Hussein",
                buildingNumber = "12345",
                streeName = "gerogre washington ln",
                city = "Gaithersburg",
                zipcode = "20235";
        System.out.println(name);
        System.out.println(buildingNumber + " " + streeName);
        System.out.println(city + " " + zipcode + ".");
        //or
// \n  is next lind command, must be put between two quote
        System.out.println(name + "\n" + buildingNumber + " " + streeName + "\n" + city + " " + zipcode);
// we can assign the whole address into one virable by copying the whole line
        String shippingAddress = name + "\n" + buildingNumber + " " + streeName + "\n" + city + " " + zipcode;
        System.out.println("shippingAddress = " + shippingAddress);
    }


}
