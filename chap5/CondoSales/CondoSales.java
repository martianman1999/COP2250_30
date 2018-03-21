
package CondoSales;

 import java.util.Scanner; 
 public class CondoSales 
 { 
 public static void main(String args []) 
 { 
 Scanner scan = new Scanner(System.in); 
 System.out.println("Press 1 for parkview, 2 for golf course view, or 3 for lake view"); 
 int a = scan.nextInt(); 
     switch (a) {
         case 1:
             System.out.println("Park View: $150,000");
             break;
         case 2:
             System.out.println("Golf Course View: $170,000");
             break;
         case 3: 
             System.out.println("Lake View: $210,000");
             break;
         default:
             System.out.println("Invalid Code: $0");
             break;
     }
 } 
 } 