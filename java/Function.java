// public class Function {
//     public static void printhelloworld(){
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//     }
//     public static void main(String[] args) {
//         printhelloworld();
//          printhelloworld();
//           printhelloworld();
//     }
// }
// import java.util.*;
// public class Function {
//     public static void printsum(int num1,int num2){
//         int sum=num1+num2;
//         System.out.println("the sum is:"+sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
// //         printsum(a,b);
// //     }
// // }
//swap of two numbers

// import java.util.*;
// public class Function {
//     public static void swap(int a,int b){
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println( "the a is "+a);
//         System.out.println( "the b is "+b);
//     }
//     public static void main(String[] args) { 
//        int a=10;
//        int b=7;
//         swap(a,b);
//     }
// }
//product of two numbers
// import java.util.*;
// public class Function {
//     public static void product(int a,int b){
//        int product=a*b;
//        System.out.println(product); 
//     }
//     public static void main(String[] args) {
//         int x=3;
//         int y=5;
//         int c=45;
//         int d=50;
//         product(x, y);
//         product(c,d);

//     }
// }
//factorial of n
// import java.util.*;
// public class Function {
//     public static int factorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         int n=6;
//         int r=5;
//         int total=factorial(n);
//         int local=factorial(r);
//         System.out.println(total);
//         System.out.println(local);
//     }

// }
// import java.util.*;
// public class Function {
//     public static int factorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static int bincoff(int n,int r){
//          int fact_n=factorial(n);
//          int fact_r=factorial(r);
//          int fact_nmr=factorial(n-r);
//          int bincoff=fact_n/(fact_r*fact_nmr);
//          return bincoff;
//     }  
//     public static void main(String[] args) {
//         int n=5;int r=2;
//         int total=bincoff(n, r);
//         System.out.println(total);
//     }  
// }
// import java.util.*;
// public class Function {
//     public static int factorial( int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//         fact=fact*i;
//        }
//        return fact;

//     }    
//     public static int bincoff(int n,int r){
//         int fact1=factorial(n);
//         int fact2=factorial(r);
//         int fact3=factorial(n-r);
//         int bincoff=fact1/(fact2*fact3);
//         return bincoff;
//     }
//     public static void main(String[] args) {
//         int n=10;int r=6;
//         int total=bincoff(n, r);
//         System.out.println(total);
//     }
// } kdshlhl
// import java.util.*;
// public class Function {
//     public static int prime(int n){
//         int flag=0;
//             if (n <= 1) {
//         System.out.println("Not a prime number");
//         return 0;
//     }

//     for (int i = 2; i < n; i++) {
//         if (n % i == 0) {
//             flag = 1;
//             break;
//         }
//     }

//     if (flag == 0)
//         System.out.println("Prime number");
//     else
//         System.out.println("Not a prime number");

//     return 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         prime(n);
//     }
    
// } 

// import java.util.*;
// public class Function{
//     public static void even(int num){
//         if (num%2==0) {
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//           even(n);
//     }
// }
// import java.util.*;
// public class Function{
//     public static int factorial(int n){
//         int fact=1;
//         int i,j;
//         for(i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number ");
//         int x=sc.nextInt();
//         int total=factorial(x);
//         System.out.println("the factorial of x is "+total);
//     }
// }
//binomial coefficient
// import java.util.*;
// public class Function {

//     public static int factorial(int n){
//         int i,j;
//         int fact=1;
//         for(i=1;i<=n;i++){
//             fact=fact*i;

//         }
//         return fact;
//     }
//     public static int binomial(int n,int r){
//         int fact_n=factorial(n);
//         int fact_r=factorial(r);
//         int fact_nmr=factorial(n-r);
//         int binomial=fact_n/(fact_r*fact_nmr);
//     return binomial;
//     }
//     public static void main(String[] args) {
//         {
//             int x=6;
//             int y=3;
//             int total=binomial(x, y);
//             System.out.println(total);
//         }
//     }
 
//     }
// import java.util.*;

// public class Function {

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=sc.nextInt();
//         boolean prime=true;
//         for(int i=2;i<=n-1;i++){
//             if (n%i==0) {       
//             prime=false;
                
//             }
//         }
//         if (prime) {
//             System.out.println("the number is the prime number"); 
//         }
//         else{
//             System.out.println("the number is not prime");
//         }
        
//     }
// }
// import java.util.*;
// public class Function {

//     public static void prime(int n){
//         boolean prime=true;
//         for(int i=2;i<=n-1;i++){
//             if (n%i==0) {
//                 prime=false;
//                 break;
//             }
//         }
//         if (prime) {
//             System.out.println("this is a prime number");
//         }
//         else{
//             System.out.println("this is not prime");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int x=sc.nextInt();
//         prime(x);

//     }
// }
// import java.util.*;
// public class Function {
//     public static boolean prime(int n){
//         for( int i=2;i<=n-1;i++){
//             if (n%i==0) {
//                 return false;                
//             }

//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(prime(7));
//     }
// }
// import java.util.*;
// public class Function {
//     public static boolean prime(int n){
//         if (n<2) {
//             return false;
//         }
//         for(int i=2;i*i<=n;i++){
//             if (n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void number(int n){
//         for(int i=2;i<=n;i++){
//             if (prime(i)) {
//                 System.out.println(i+"");                
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         number(9);
//     }
// }
//prime
// import java.util.*;
// public class Function {
//     public static void prime(float n){
//         boolean prime=true;
//         for(int i=2;i<=n-1;i++){
//             if (n%i==0) {
//                 prime=false;
//                 break;
//             }
//         }
//         if (prime) {
//             System.out.println("the number is prime");            
//         }
//         else{
//             System.out.println("the no is not prime");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int x=sc.nextInt();
//         prime(x);


//     }
// }
//print all the prime number in between 1 to n

// import java.util.*;
// public class Function {

//     public static boolean prime(int n){
        
//         if (n<2) {
//             return false;  
//         }
//         for(int i=2;i*i<=n;i++){
//             if (n%i==0) {
//                 return false;
//             }
//         }
//         return true;    
//     }
//     public static void number(int n){
//          for( int i=2;i<=n;i++){
//             if (prime(i)) {
//                 System.out.println(i);
//             }
//          }
//          System.out.println();
//     }
//     public static void main(String[] args) {
//         number(100);
//     }
// }
// import java.util.*;
// public class Function {
//         public static boolean prime(int n){
//             if (n<2) {
//                 return false;
//             }
//             for(int i=2;i*i<=n;i++){
//                 if (n%i==0) {
//                     return false;
//                 }
//             }
//             return true;
//         }
//         public static void number(int n){
//             for(int i=2;i<=n;i++){
//                 if (prime(i)) {
//                     System.out.println(i);
//                 }
//             }
//             System.out.println();
//         }
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int x=sc.nextInt();
//             number(x);
//         }
// }
// import java.util.*;
// public class Function {

//     public static void bintodecimal(int binarynum){
//         int mynum=binarynum;
//         int power=0;
//         int decimal=0;
//         while (binarynum>0) {
//             int LD=binarynum%10;
//             decimal=decimal+(LD*(int)Math.pow(2,power));
//             power=power+1;
//             binarynum=binarynum/10;
//         }
//         System.out.println("the decimal number of  "+mynum + " is " +decimal);
//     }
//     public static void main(String[] args) {
//         bintodecimal(101);
//     }
// }
// import java.util.*;
// public class Function {

//     public static void bintodec(int binno){
//         int mynum=binno;
//         int decimal=0;
//         int power=0;
//         while (binno>0) {
//             int LD=binno%10;
//             decimal=decimal+(LD*(int)Math.pow(2,power));
//             power=power+1;
//             binno=binno/10;
//         }
//         System.out.println("the decimal no of  "+ mynum +" is "+decimal);
//     }
//     public static void main(String[] args) {
//         bintodec(11011);
//     }
// }
//binary to decimal
import java.util.*;
public class Function {

    public static void bintodec(int binno){
        int mynum=binno;
        int decimal=0;
        int power=0;
        while (binno>0) {
            int LD=binno%10;
            decimal=decimal+(LD*(int)Math.pow(2,power));
            power=power+1;
            binno=binno/10;
        }
        System.out.println("the decimal of  "+ mynum  + " is "+decimal);
    }
    public static void dectobin(int n){
        int mynum=n;
        int binum=0;
        int power=0;
        while (n>0) {
           
             int rem=n%2;
            binum=binum+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        System.out.println("the binary number of "+ mynum +" is "+binum);
    }
    public static void main(String[] args) {
       dectobin(7);
    }
}

    


