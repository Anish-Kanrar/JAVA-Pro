        /*Default Constructor */
 
 class Default {
    int a;
    String b;
    boolean c;
    
    Default(){
        a=100; b="Virat";c=true;
    }

    void display(){
        System.out.println(a+" "+b+" "+c);
    }
}

class DefaultTest{
    public static void main(String[] args) {
        Default sc=new Default();
        sc.display();
    }
}
