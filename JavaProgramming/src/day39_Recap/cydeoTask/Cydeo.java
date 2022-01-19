package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester= new Tester("Nawar",31,'M',161942754,"SDET",120000);

        Developer developer= new Developer("Ali",32,'M',5643245,"Dev",150000);

        Teacher teacher=new Teacher("Muhtar",34,'M',1234567,"Instructor",240000);

        Student student=new Student("Loca",28,'F',34523,"JAVA");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);
    }
}
