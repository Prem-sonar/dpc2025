class day8{
    static public String reverseString(String str){
        String newstr[]=str.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=newstr.length-1;i>=0;i--){
            if(newstr[i].length()>0){
                sb.append(newstr[i]);
                sb.append(" ");
            }
        }
        String reverse=sb.substring(0,sb.length()-1).toString();
        return reverse;
    }
    public static void main(String ar[]){
        String  str="      the sky     is blue ";
        System.out.println(reverseString(str));
    }
}
