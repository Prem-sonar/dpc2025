import java.util.Arrays;

public class day9 {
    String longestcommonPrefix(String str[]){
        if(str.length==0){
            return "no string";
        }
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        int i;
        for(i=0;i<str.length;i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
        }
        if(i==0){
            return "";
        }
        else{
            return first.substring(0,i);
        }
    }
    public static void main(String ar[]){
        day9 d9=new day9();
        String str[]={"dog"};
        String prefix=d9.longestcommonPrefix(str);
        System.out.println(prefix);
    }
}
