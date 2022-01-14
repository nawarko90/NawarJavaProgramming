package day31_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Nawar", 'M', 31);
        System.out.println(person1);

        Person person2 = new Person("Dalya", 'F', 25);

        Person person3 = new Person("Danya", 'F', 27);


        Person[] people = {person1, person2, person3};

        //ArrayList<Person> personGender = new ArrayList<>(Arrays.asList(people));

        for (Person each : people) {
            if (each.gender == 'F') {
                System.out.println("the femails in this group are: " + each.name);
            }
        }
        ArrayList<Person> peopleAge= new ArrayList<>(Arrays.asList(people));

        peopleAge.removeIf(p->p.age <26);
        for (Person each : peopleAge) {
            System.out.println("people who are older than 26 are: "+each.name+" : "+each.age);

        }

    }
}