public class substring {
    public static String substringg(String str ,int si, int end){
        String suvstr=" ";
        for(int i = si ; i<end; i++){
            suvstr+= str.charAt(i);

        }
        return suvstr;
    }
    public static void main(String[] args) {
        String str ="helloWorld";
        System.out.println(substringg(str, 1, 5));
    }
    
}
// .substring also