public class reversarrayl {
    public static void reverse(int numbers[]){
        int start =0 ,end = numbers.length-1;
        while(start < end){
            int temp = numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[]={1,2,4,54,5,56,6,5,7};
        reverse(numbers);

        for(int i =0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }
    
}
