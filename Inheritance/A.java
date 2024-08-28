package OOPs.Inheritance;
/*Multilevel inheritance*/
public class A {  //Super class
    int a,b,c;
    void add()
    {
        a=10;b=20;
        c=a+b;
        System.out.println("Sum of two number:"+c);
    }void sub()
    {
        a=200;b=100;
        c=a-b;
        System.out.println("Sub of two number:"+c);
    }
}
class B extends A{ //sub class 1
    void multi()
    {
        a=10;b=20;
        c=a*b;
        System.out.println("multi of two number:"+c);
    }
    void div()
    {
        a=20;b=2;
        c=a/b;
        System.out.println("div of two number:"+c);
    }
}

class C extends B{
    void rem()
    {
        a=10;b=3;
        c=a%b;
        System.out.println("Remainder of two number:"+c);
    }
    
}

class Test{
    public static void main(String[] args) {
        C r=new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
        }
}

