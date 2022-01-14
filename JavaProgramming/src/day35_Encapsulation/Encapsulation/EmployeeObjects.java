package day35_Encapsulation.Encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee("Nawar Hussein",'M',31,120000);


        System.out.println("Employee name is " +employee1.getName()+" his age is "+ employee1.getAge()+" his gender is " + employee1.getGender()+". Finally, his salary is $"+ employee1.getSalary());
    }
}
