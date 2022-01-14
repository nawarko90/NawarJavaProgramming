package day12_scanner;

import java.util.Scanner;

public class PeopleInTheHouse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many people they live with you?");
        int numberOfPeople= input.nextInt();
        String result="";
        if(numberOfPeople <3){
          result="live with less than 3 people";
        }else if(numberOfPeople>=3 && numberOfPeople <=6){
            result="Live with 3 - 6 people";
        }else {
            result="Live with more than 6 people";
        }

        System.out.println(result);

    }
}
/*Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */