package OOPs.Inheritance;
/*Simple Inheritance*/
public class student { //super class
    protected int roll;
    protected int marks;
     String name;
    protected void input(){
            System.out.println("Roll, name & marks:");
        }
    }

class Alok extends student  //sub class
{
    void display(){
    roll=4;marks=96;name="Alok";
        System.out.println(roll+" "+marks+" "+name);
    }

    public static void main(String[] args) {
        Alok sc=new Alok();
        sc.input();
        sc.display();
    }
}
//reuse
