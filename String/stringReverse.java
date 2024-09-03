                                    /*String Reverse */

public class stringReverse {
    public static void main(String[] args) {
        /*  StringBuffer r=new StringBuffer("CEMK IS BEST");
        System.out.println(r.reverse());*/

       /*  StringBuilder ref=new StringBuilder("Java Coding");
        System.out.println(ref.reverse()); */

        String r="Learn Java";
        String r2="";
        int l=r.length();  //l=10

        for(int i=l-1;i>=0;i--){  //i=9
            r2=r2+r.charAt(i);
        }
        System.out.println(r2);
       
    }
    
}
