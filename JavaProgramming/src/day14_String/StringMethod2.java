package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String email = "nawarko90@yahoo.com";

        String e1 = email.replace("yahoo", "gmail");

        System.out.println("e1 = " + e1);
        String name = "Nawar Hussein";
        name = name.replace("Nawar", "Waleed");
        System.out.println(name);
        
        
        String sentence="Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String corrected=sentence.replace("Python","").replace("   "," ");
        //corrected=corrected.replace("   "," "); we can remove sapaces this way as well
        System.out.println("corrected = " + corrected);

        String s= "Dog Dog Dog Dog Dog";
        s=s.replace("Dog","Cat");
        System.out.println("cat = " + s);

        String s2= "C# is fun, C# is cool";
        s2=s2.replace(" C#", " Java");
       // s2=s2.replace("C# is cool", "Java is cool"); another way
        System.out.println("s2 = " + s2);

        String s3= "Java";
        s3=s3.replace("a","e");
        System.out.println("s3 = " + s3);
        System.out.println("----------------------------------");
        String result="Java Java Java";
        result=result.replaceFirst("Java", "Paython");
        System.out.println("result = " + result);

String result2="Java";
result2=result2.replaceFirst("va","na");
        System.out.println("result2 = " + result2);


    }
}
