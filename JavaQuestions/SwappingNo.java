public class SwappingNo {
        public static void main(String [] args){
                int a=90;
                int b=100;
                System.out.println("Before Swapping Numbers"+" a"+"="+a+" b"+"="+b);

                a=a+b;
                b=a-b;
                a=a-b;

                System.out.println("After Swapping Numbers"+" a"+"="+a+" b"+"="+ b);
        }
}
