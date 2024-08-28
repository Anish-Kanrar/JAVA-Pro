/*Parameterized Constructor */

class parameterizedCons {
    int x,y;
    parameterizedCons(int a,int b)  //parameterized
    {
        x=a;y=b;
    }
    parameterizedCons(int a,String b)  //parameterized
    {
        //x=a; y=b;
        System.out.println(a+" "+b);
    }
    void show(){
        System.out.println(x+" "+y);
    }
}

class parameterizedConsTest{
    public static void main(String[] args) {
        parameterizedCons sc=new parameterizedCons(100,200);
        sc.show();
        parameterizedCons ref=new parameterizedCons(235,"Rohit");
        
    }
}