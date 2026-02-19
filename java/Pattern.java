//SOLID RECTANGLE
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=7;j++){
//                 System.out.print("*");
//             }
//             System.out.println("*");

//         }
//     }
// }
//HOLLOW RECTANGALE
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int i,j;
//         for(i=1;i<=n;i++){
//          for(j=1;j<=m;j++){
//             if (i==1 || j==1||i==n||j==m) {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
         
//            }
//            System.out.println();
//         }
//     }
// }
//HALF PIRAMID
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// pyramid inverted
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for( int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// inverted number pattern
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int i,j;
//         for(i=n;i>=1;i--){
//             for(j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//anathor problem
// inverted number pattern
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//floyd tringle
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int number =1;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println("");
//         }
import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         int m=5;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=m;j++){
//                 if (i==1||j==1||i==n||j==m) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//     }
// }
//0-1 tringle
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 int sum=i+j;
//                 if (sum%2==0) {
//                     System.out.print(1);
//                 }
//                 else{
//                     System.out.print(0);
//                 }

//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         int i,j;
//         for(i=4;i>=1;i--){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
// 
//butterfly pattern
// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         int n=6;
//         int i,j;
//         //print first pattern
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //print space
//             int space=2*(n-i);
//             for(j=1;j<=space;j++){
//             System.out.print(" ");
//         }
//         //print stars
//         for(j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     //reverse of the pattern
//     for(i=n;i>=1;i--){
//         for(j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         //print space
//         int space=2*(n-i);
//         for(j=1;j<=space;j++){
//             System.out.print(" ");
//         }
//         // 
//         for(j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
// }
//
//solid rhombus
// public class Pattern{
//     public static void main(String[] args) {
//         int n=7;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//number pyramid
// public class Pattern{
//     public static void main(String[] args) {
//         int n=6,i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }
//PALINDROMIC PATTERNpi
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
// public class Pattern{
//     public static void main(String[] args) {
//         int n=6;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//                 System.out.println();
//         }
//         for(i=n;i>=1;i--){
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Pattern{
//     public static void main(String args[]){
//         int n=6;
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{

// }

