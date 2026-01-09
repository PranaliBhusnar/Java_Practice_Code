public class CountDigit{
    public static void main(String[] args){
        int n=12345;
        /*In Java, when you use "" + n,
it means you’re concatenating an empty string with the integer.
Java automatically converts the integer into a string using String concatenation.
So after this line,
s becomes "12345" (a string, not a number).*/
        String s="" +n;
        //After converting into string we get length of string
        System.out.println(s.length());
        /*Without converting to string
        int n = 12345;
int count = 0;
while (n > 0) {
    n = n / 10;
    count++;
}
System.out.println(count);  // Output: 5
 */

    }
}