

public class argumentpassing {
    // updateing array value
    public static void update( int marks[] ,int nonChangable){
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[]={23,35,53};
        int nonChangable= 5;
        update(marks ,nonChangable);
        System.out.println(nonChangable);
// for printig the array
        for(int i=0 ; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println(" "); //it is use for next line 
    }
}