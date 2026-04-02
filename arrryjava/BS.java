public class BS {
    public static int binarySearch(int numbers[],int key){
        int Start=0, end= numbers.length-1;
        while (Start <= end) {
            int mid= (Start + end) /2;

            if ( numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                Start = mid+1;
            }else{
                end = mid -1;
            }
            
        }
        return -1;
    }

    public static void main(String [] args){
        int numbers[] ={1,2,65,4,6,7,8};
        int key=8;
        System.out.println("index for the key is " + binarySearch(numbers, key));
    } 
    
}
