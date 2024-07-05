import java.util.*;

public class Strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }

    public static void main(String args[]) {
        char arr[] = { 'v', 'i', 'r', 'a', 't' };
        // System.out.println(arr);
        String str = "virat";
        System.out.println(str);
        String str2 = new String("kohali");
        System.out.println(str2);

        /*
         * Scanner sc= new Scanner(System.in);
         * String name ;
         * //name=sc.next();
         * name=sc.nextLine();
         * System.out.println(name);
         */

        /*
         * String length()
         * String fullName = "Virat kohali";
         * System.out.println(fullName.length()); //12
         */

        // concatenation
        String firstName = "Anik";
        String lastName = "Kanrar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

       // System.out.println(fullName.charAt(0));
       printLetters(fullName);
    }
}