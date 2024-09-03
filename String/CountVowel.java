import java.util.*;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the word:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        for(int i=0;i<l;i++){
            char p=s.charAt(i);
        if(p=='A'||p=='E'||p=='I'||p=='O'||p=='U'){
            count++;
        }
    }
        System.out.println("Number of vowel in Word:"+count);
    }
}
