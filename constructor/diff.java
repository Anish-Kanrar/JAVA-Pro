/*Instance block vs Static block */

/*class diff {
    diff(){
        System.out.println("default constructor");
    }
    {
        //Instance block
        System.out.println("Work Hard...");
    }  
    static{
        System.out.println("I can do it...");
    }  
    public static void main(String[] args) {
        diff r=new diff();
    }
}
*/

class diff{
    int a=98;static int b=78;
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        diff r=new diff();
    }
}
