                              /*String Manupulation */
//String is a wrapper class.It is not a data type.
//String always start 0 and end NULL charector.
/*String methods---->

* 1.length()☑️
 2.charAt() ☑️
3.toUpperCase() ☑️
4.toLowerCase()☑️
5.trim() ☑️
6.indexOf() ☑️
7.lastIndexOf()
8.equals() ☑️
9.equalsIgnoreCase()
10.substring()
11.compareTo()
12.concat() ☑️
13.replace() ☑️
14.isEmpty() ☑️
 */

public class basic{
    public static void main(String[] args) {
        String s1="VIRAT";
        String s2="virat";
        System.out.println(s1.length());        //5
        System.out.println(s1.toLowerCase());  //virat
        System.out.println(s2.toUpperCase());  //VIRAT
        System.out.println(s2.concat(s1));     //viratVIRAT

        String s3="    Rahit Sharma    ";
        String s4="";       
        String s5=" ";       
        System.out.println(s3.trim());     //Rahit Sharma
        System.out.println(s4.isEmpty());  //true
        System.out.println(s5.isEmpty());  //false
        
        String s6="APPLICATION";
        System.out.println(s6.charAt(2));   
        System.out.println(s6.indexOf('i'));  //-1
        System.out.println(s6.indexOf('I'));  //4

        System.out.println(s2.equals(s1));  //false

        String s7="KAMAL";
        System.out.println(s7.replace('M','N'));  //KANAL

        
    }
}
