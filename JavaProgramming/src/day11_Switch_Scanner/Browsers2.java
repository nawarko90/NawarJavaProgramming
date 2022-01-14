package day11_Switch_Scanner;

public class Browsers2 {
    public static void main(String[] args) {
        String browserName= "chrome";
        switch (browserName){
            case"safari":
                browserName="safari";
                break;
            case"opera":
                browserName="opera";
                break;
            case"firefox":
                browserName="firefox";
                break;
            case"chrome":
                browserName="chrome";
                break;
            default:
                browserName="invalid browser";
        }
        System.out.println("browserName = " + browserName);

    }
}
/*
 write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */