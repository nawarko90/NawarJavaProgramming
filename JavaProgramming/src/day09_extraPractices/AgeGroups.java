package day09_extraPractices;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 72;
        String group;
        if (age >=1) { // this is Nested if

            if (age == 1 || age == 2) {
                group = "infant";
            } else if (age >= 3 && age <= 5) {
                group = "Toddler";
            } else if (age >= 6 && age <= 9) {
                group = "kid";
            } else if (age >= 10 && age <= 12) {
                group = "Pre-Teen";
            } else if (age >= 13 && age <= 17) {
                group = "teenager";
            } else if (age >= 18 && age <= 20) {
                group = "young adult";
            } else if (age >= 21 && age <= 39) {
                group = "adult";
            } else if (age >= 40 && age <= 49) {
                group = "young Middle-aged adult";
            } else if (age >= 50 && age <= 54) {
                group = "middle age";
            } else if (age >= 55 && age <= 64) {
                group = "very young senior";
            } else if (age >= 65 && age <= 74) {
                group = "young senior citizen";
            } else if (age >= 75 && age <= 84) {
                group = "senior citizen";
            } else {
                group = "old senior citizen";
            }
        } else {
            group = "Invalid";
        }

        System.out.println("group = " + group);

    }
}

  /*
        Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
         */