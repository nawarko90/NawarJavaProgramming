package NawarPractice.Resturant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String Owner,Location;
    public int numberOfStars;
    public ArrayList<Server>Servers=new ArrayList<>();
    public ArrayList<Chef> Chefs= new ArrayList<>();
    public int numberOFchefs;


    public Restaurant(String owner, String location, int numberOfStars) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        Servers.add(server);
    }
    public void hireServers(Server[]servers){
        Servers.addAll(Arrays.asList(servers));
    }
    public void hireChefs(Chef[]chefs){
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
     Chefs.removeIf(p->p.employeeID== employeeID);

        }
        public void terminateServer (int employeeID){
        Servers.removeIf(p->p.employeeID==employeeID);
    }


    public String toString() {




        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Servers=" + Servers.size() +
                ", Chefs=" + Chefs.size() +
                '}';
    }
}

/*
Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs.
 */