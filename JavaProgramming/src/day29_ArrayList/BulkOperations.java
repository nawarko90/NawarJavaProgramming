package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,3,5,5,5,8,8,8,8));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> number= new ArrayList<>();
        number.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        System.out.println(number);
        number.retainAll(Arrays.asList(100,200,300));
        System.out.println(number);

        System.out.println("----------------------------------------------------");

        ArrayList<String> jobTitle=  new ArrayList<>();

        jobTitle.addAll(Arrays.asList("QA","SDET","Deverloper","QA","SDET","Scrum master","BA"));
        jobTitle.retainAll(Arrays.asList("QA","SDET"));//Any element that is not matching in the orginal array with these givin value will be removed

        System.out.println(jobTitle);

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1= nums.contains(10);

        boolean r2= nums.contains(2) && nums.contains(5) && nums.contains(10);

        System.out.println("r2= "+ r2);

        boolean r3= nums.contains(Arrays.asList(2,5,10));
        System.out.println("r3= "+r3);


        System.out.println("-------------------------------------");

        String[] names= {"Josh","Jack","Dan","Shay","Breanna"};

        /*
        ArrayList<String> nameList= new ArrayList<>();
        nameList.addAll(Arrays.asList(names)); this is one way to convert array to array list

         */
        ArrayList<String> nameList= new ArrayList<>(Arrays.asList(names)); // this is the easier way to convert array to array list( works on non-primitive only)

        System.out.println("---------------------------------------------------------");

        int [] arr= {1,2,3,4,5,6,7,8,9};

      //  ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));  we can't convert primitive to array list
        Integer [] arr2= {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr2));

        System.out.println(list2);

        System.out.println("-----------------------------------");
        int [] arr3= {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(arr3));// we can convert primitive to array list with the custom method that we created


    }


    public static ArrayList<Integer> convertArrayToArrayList (int [] array){

        ArrayList<Integer> list= new ArrayList<>();

        for (int each : array) {
            list.add(each);

        }
        return list;

    }


}
