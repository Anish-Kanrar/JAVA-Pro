/*Copy Constructor */
class copyCons {
    int a; String b;
    copyCons(){
        a=10;b="Good";
        System.out.println(a+" "+b);
    }
    copyCons(copyCons ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);

    }
}

class copyConsTest{
    public static void main(String[] args) {
        copyCons r=new copyCons();
        copyCons r2=new copyCons(r);
    }
}