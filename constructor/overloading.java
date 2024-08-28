                    /*Constructor Overloading */
class overloading {
    int a;
    double b;
    String c;
    private overloading(){
        a=10011;b=5.32;c="barun";
    }

    // overloading(){
    //     // a=100;b=45.32;c="Virat";
    // }
    
    overloading(int x){
        a=x;
    }
    
    overloading(double y,String z){
        b=y; c=z;
    }
    public static void main(String[] args) {
        overloading r = new overloading();
        overloading r2 = new overloading(10);
        overloading r3 = new overloading(10.61,"Hardik");
        System.out.println(r.a+" "+r.b+ " "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+ " "+r3.c);
        
    }
}
// class test{
    
// }
