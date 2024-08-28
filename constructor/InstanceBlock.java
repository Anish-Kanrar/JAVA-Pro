 class InstanceBlock {
    int a,b;
    void show(){
        a=66;b=44;
        System.out.println(a+" "+b);

    }
    InstanceBlock(){
        //constructor
        a=28;b=90;
        System.out.println(a+" "+b);

    }
    {
        //instance block
        a=98;b=78;
        System.out.println(a+" "+b);
    }
}
class test{
    public static void main(String[] args) {
        InstanceBlock r=new InstanceBlock();
        r.show();
    }
}

/* 
output-->
98 78
28 90
66 44
*/

//static method->InstanceBlock->default constructor->method