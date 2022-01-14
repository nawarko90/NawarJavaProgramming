package day32_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Nawar");
        System.out.println(employee1);

        Employee employee2= new Employee("Nawar",'M');
        System.out.println(employee2);

        Employee employee3= new Employee("Nawar",'M',"SDET");
        System.out.println(employee3);


    }
}
