import java.util.Scanner;
public class factorialNo {
        public static void main(String [] args){
                System.out.println("Enter the number");
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int fact=1;
                for (int i=1;i<=n;i++){
                        // f=i*i;
                        fact=fact*i;
                }
                System.out.println("Factorial Number of "+ n + " are "+fact);

        }
}
