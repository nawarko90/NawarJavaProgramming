package NawarPractice.Resturant;

import java.util.ArrayList;
import java.util.Arrays;

public class localResturant {
    public static void main(String[] args) {

        Restaurant restaurant1= new Restaurant("Nawar","MD",5);
        Server server1=new Server("baka",1125,12.50,true);
        Server server2=new Server("logi",5894,15.9,false);
        Server server3= new Server("Maria",12345,22.5,true);

        Server[] ArrayOfServers={server1,server2,server3};

        ArrayList<Server>servers=new ArrayList<>(Arrays.asList(ArrayOfServers));

        System.out.println(servers);



    }
}