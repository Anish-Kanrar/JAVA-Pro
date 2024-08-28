class demo{
    //class er jonno kono memory occupy korar dorkar nei
    int a=10;
    String b="Anish";
    void show(){
        System.out.println(a +" "+ b);
    }
}

class demoTest{
    public static void main(String []args){
        //demo sc = new demo();
        demo sc;
        sc=new demo();
        sc.show();
    }
}