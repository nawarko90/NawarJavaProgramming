package day31_constructors;

public class Offer {

    public String location,companyName,jobTitle;
    public double salary;
    public boolean hasBenefit,hasPTO ,isWFH,isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }
// the setInfo helps me to generate all the attributes from the class(every time when we create a new object, different copy of these variables will be created)
   // to create the setInfo, we right-click, then generate, then select all. After that, we change the class name sentInfo, and we put void behind it as a return type.


// in order to be able to print every object from this offer class, we will need toString Method, otherwise we will get hashCode
   //it get excueded every time when we pass object of this offer class in the print statement
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Offer Task:
    1. Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
 */