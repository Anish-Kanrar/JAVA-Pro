import java.util.Scanner;

public class NumberOfWord {
    public static void main(String[] args) {
        String s;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            char p=s.charAt(i);
            if(p == ' '){
                count++;
            }
        }System.out.println("The no of words:"+(count+1));

    }
}
