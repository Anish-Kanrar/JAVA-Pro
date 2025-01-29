public class ForEach {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("For each loop:");
        for (int b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("For loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
