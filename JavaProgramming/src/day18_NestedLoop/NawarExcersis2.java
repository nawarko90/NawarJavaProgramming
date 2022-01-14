package day18_NestedLoop;

public class NawarExcersis2 {
    public static void main(String[] args) {
        String name = "----qwe--r--tyf...gd.---";
        String name2 = "";

        for (int i = 4; i < name.length()-4; i++) {
           String code = "" + name.charAt(i);
if(!code.contains("-")&&!code.contains(".")){
    name2+=code;
}
            }
        System.out.println(name2);

        }

    }


//"----qwe--r--tyf...gd.---"