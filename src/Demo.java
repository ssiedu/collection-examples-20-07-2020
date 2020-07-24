
public class Demo {

    //this method is supposed to return the square and cube both
    public static int[] compute(int n) {
        int square = n * n;
        int cube = square * n;
        //we can group multiple elements in a single unit with the help of collection
        int data[]={square,cube};
        return data;
    }

    public static void main(String[] args) {

        //we need a method to compute the square of a given number.
        int result[] = compute(5);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
