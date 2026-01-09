import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word:");
        String Word=sc.nextLine();
        int n=0,m=Word.length();
        for(int i=0;i<m;i++){
            if(Word.charAt(n)!=Word.charAt(m)) {// charAt is get the character at a specific position
                System.out.print("Not palindrome");
            }
                n++;
                m--;  
        }
        

    }
}