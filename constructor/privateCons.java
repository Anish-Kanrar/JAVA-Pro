/*private constructor */

class privateCons {
    int a;double b;String c;
    private privateCons(){
        a=10;b=78.99;c="Animesh";
        System.out.println(a+" "+b+ " "+c);
    }
    //static void show(){}
    public static void main(String[] args) {
        privateCons r= new privateCons();
    }
}

/* 
class B{
    public static void main(String[] args) {
        privateCons r= new privateCons();
    }
}
*/