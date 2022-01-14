package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);//1 indicate something went wrong, 0 indicate nothing went wrong. both will exit the program
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);//1 indicate something went wrong, 0 indicate nothing went wrong. both will exit the program
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


}
