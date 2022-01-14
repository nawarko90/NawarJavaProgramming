package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

double price=3.69;
int calories=90;
String size= "don";

/*if(size =="tall" || size =="grande" ||size =="venti"){
if(size=="tall"){
    System.out.println(size+":\n price is "+price+" \n"+calories+ " calories");
}else if(size=="grande"){
    System.out.println(size+":\n price is "+price+" \n"+calories+ " calories");
}else{
    System.out.println(size+":\n price is "+price+" \n"+calories+ " calories");
}


}else{
    System.out.println("invalid");
}
*/
/*switch (size){
    case "tall":
        System.out.println("tall:\n price is 3.69 "+" \n"+"100 calories");
        break;
    case "grande":
        System.out.println("Grande:\n price is 4.69 "+" \n"+"200 calories");
        break;
    case"verti":
        System.out.println("verti:\n price is 5.69 "+" \n"+"150 calories");
    default:
        System.out.println("invalid");
}
*/
if(size =="tall" || size =="grande" ||size =="venti"){
   switch (size){
       case "Tall":
           System.out.println("tall:\n price is 3.69 "+" \n"+"100 calories");
           break;
       case"grande":
           System.out.println("Grande:\n price is 4.69 "+" \n"+"200 calories");
           break;
       case "venti":
           System.out.println("venti:\n price is 5.69 "+" \n"+"300 calories");
   }



}else{
    System.out.println("size invalid");
}

    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */