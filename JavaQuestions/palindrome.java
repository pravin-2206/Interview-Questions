import java.util.Scanner;
public class palindrome {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                String str=sc.nextLine();
                String rev="";
                for(int i=str.length()-1;i>=0;i--){
                        rev=rev+str.charAt(i);
                }
                if (str.equals(rev)){
                        System.out.print("Given String is Palindrome ");
                }
                else{
                        System.out.print("Given String is Not Palindrome ");
                }


        }
}
