public class Typecasting{
    public static void main(String[] args){
         char ch='A';
         int x=ch;
         System.out.println(x);//Implicite typecasting
         char a='B';
         int b=(int)a;
         System.out.println(b);//Explicite typecasting
         //ASCII Values
         //A=65 to Z=90
         //a=97 to z=122
         // 0=48 to 9=57
         char c='C';
         System.out.println(c+0);//When we perform addition of char and int char will work as integer with their ASCII value
         System.out.println(c+1);
         System.out.println(c*0);
         // Space has ASCII Value 32
    }
}