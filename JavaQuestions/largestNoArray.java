// public class largestNoArray {
//         public static void main(String[] args){
//                 int arr[]={10,20,40,30};
//                 int temp=0;

//                 for (int i=1;i<arr.length;i++){
//                         for (int j=i+1;i<arr.length;j++){

//                                 if(arr[i]>=arr[j]){
//                                         temp=arr[i];

//                                 }

//                         }

//                 }
//                 System.out.println(temp);
//         }
// }



public class largestNoArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 40, 30};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}