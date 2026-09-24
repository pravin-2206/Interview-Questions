import java .util.Scanner;
class reverseString{
        public static void main(String[] args){
                System.out.print("Enter the String: ");
                Scanner sc=new Scanner(System.in);
                String str=sc.nextLine();
                String rev="";
                for(int i=str.length()-1;i>=0;i--){
                        rev=rev+str.charAt(i);
                }
                System.out.println("Reverse String: "+rev);
                // for(int i=str.charAt(0);i<=str.length();i++){
                //         System.out.println(i);
                // }

        }
}