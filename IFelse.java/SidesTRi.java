import java.util.*;
public class SidesTRi{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first side of triangle");
     int side1= sc.nextInt();
        System.out.println("Enter Second side of triangle");
         int side2= sc.nextInt();
          System.out.println("Enter third side of triangle");
           int side3= sc.nextInt();
           if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){System.out.println(side1+side2+side3" these are the sides of triangle ");}
           else{
            System.out.println(side1+side2+side3" these are not sides of trianlge");
           }
    }
}