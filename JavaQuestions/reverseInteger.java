public class reverseInteger {
        public static void main(String[] args){
                int n=123;
                int r=0,dig;
                System.out.println("Before :"+n);

                while(n!=0){
                        dig = n % 10;
                        r = r * 10 + dig;
                        n = n / 10;
                }

                System.out.println("After :"+r);



        }
        
}
