package Function_method;

public class product {
    public static int getProduct(int a,int b){
        int product=a*b;
        
        return product;
    }
    public static void main(String args[]){
        // int a=4;
        // int b=8;
        // int x=getProduct(a,b);
        int x=getProduct(4,5);
        System.out.println("product is:" +x);
    }
}
