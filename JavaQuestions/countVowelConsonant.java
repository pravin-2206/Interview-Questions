import java.util.Scanner;
public class countVowelConsonant{
        public static void main(String[] args){
                System.out.print("Enter the String To Check count of vowel and consonants: ");
                Scanner sc=new Scanner(System.in);
                String str=sc.nextLine();
                int vowel=0,conso=0;
                for(int i=str.length()-1;i>=0;i--){
                        char ch=str.charAt(i);
                        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                                vowel+=1;
                        }
                        else{
                                conso+=1;
                        }
                }
                System.out.print("Count of vowel : "+vowel+" Count of consonants: "+conso);


        }
}