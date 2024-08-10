
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
               ans.append((char)(c+2));
            }else if(Character.isLowerCase(c)){
               ans.append((char)(c+2));
            }else if(Character.isDigit(c)){
                ans.append((char)(c+2));
            }else{
                ans.append((char)c);
            }
        }
        System.out.println(ans.toString());
    }
}