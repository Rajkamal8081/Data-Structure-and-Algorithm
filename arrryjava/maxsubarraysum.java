// public class maxsubarraysum {
//        public static void printMaxSum(int numbers []){
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i =0; i<numbers.length; i++){
//             int start = i;
//             for (int j=i;  j<numbers.length;j++){
//                 int end =j;
//                 currSum=0;
//                 for(int k =start; k<=end; k++){
//                   currSum+=numbers[k];
//                 }
//                 System.out.println(currSum);
//                if(maxSum< currSum){
//                 maxSum =currSum;
//                }
//             }
        
//         }
//          System.out.println("max sum ="+ maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] ={2,3,4,5,6};
//         printMaxSum(numbers);
   
//     }
    
// }



// second way to prefrom this 

public class maxsubarraysum {
    public static void maxsum(int numbers[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i =1; i<prefix.length;i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }

        for(int i=0; i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum <curSum){
                    maxSum =curSum;
                }
            }
        }
        System.out.println("max sum ="+ maxSum);

    }

    public static void main(String[] args) {
        int numbers[]={1,6,2};
        maxsum(numbers);
    }

    
}