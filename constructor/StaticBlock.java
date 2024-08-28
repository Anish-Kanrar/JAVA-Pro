                        /*Static Block */

class StaticBlock {
    public static void main(String[] args){
        StaticBlock r=new StaticBlock();
    }
    StaticBlock()  //constructor
    {
        System.out.println("Think Positively..."); 
    }
    {  //Instance block
        System.out.println("Exercise Daily...");
    }
    static{
        System.out.println("I do it...");
    }
}
