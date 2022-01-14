package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        /*
        Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
         */

       String browserName="edge";
       String result=""; // temporary value

        boolean validBrowser= browserName =="chrome" ||browserName =="firefox" || browserName=="opera"
       ||browserName == "safari"|| browserName=="edge";

        if(validBrowser){
          if(browserName=="chrome"){
              result="Chrome";
          }else if(browserName=="firefox"){
              result="firefox";
          }else if(browserName=="opera"){
              result="opera browser is selected";
          }else if(browserName=="safari"){
              result="safari browser is selected";
          }else{
              result="edge browser is selected";
          }

        }else{
            result="Invalid Browser Name";
        }

        System.out.println("result = " + result);





    }

}
