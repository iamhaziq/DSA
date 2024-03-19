import java.util.Scanner;

public class fibonacciAlogArray {
    
    public static void main(String[] args) {
        
        int index;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index");
        index = input.nextInt();
        input.close();
        fibonacci(index);
        

    }
    public static void fibonacci(int index) {
        int[] fibarray = new int[index];
        fibarray[0]= 1;
        fibarray[1] = 1;
        System.out.print(fibarray[0]+ " ");
        System.out.print(fibarray[1]+ " ");
        for (int i = 2 ; i< index;i ++ ){
            fibarray[i] = fibarray[i-1] + fibarray[i-2];
            System.out.print(fibarray[i]+ " ");
        }
        
    }
}