package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        Initials("Nawar","hussein");
        domain("nawarko90@yahoo.com");

        System.out.println("----------------------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };
        for (String email : emails) {
            domain(email);

        }
        System.out.println("--------------------------------------------------");
        nameOfMonth(4);

    }
//	1. Create a method that can display the initials of the person

    public static void Initials(String firstName, String lastName){

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

//	2. Create a method that can display the domain of the email

    public static void domain(String email){

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);        }

//	3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth (int number){

        String name = "";

        if (number >=1 && number <=12){

            name= (number==1)?"Jan" : (number==2)?"Feb": (number==3)?"mar":(number==4)?"april":(number==5)
                    ?"may":(number==6)?"jun":(number==7)?"july":(number==8)?"aug":(number==9)
                    ?"sep":(number==10)?"pvt":(number==11)?"nov": "dec";

        }else {
            name= "Invalid";
        }
        System.out.println("Month name = " + name);
    }



}

/*
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */