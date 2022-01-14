package day12_scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your current speed limit?");
        int speedLimit=55;
        int ActualSpeed=input.nextInt();
        if (ActualSpeed>speedLimit){
            System.out.println("Slow down, you are driving "+ (ActualSpeed-speedLimit)+ " over speed limit");
        }
    }
}
/*
Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */