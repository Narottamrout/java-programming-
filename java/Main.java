//there is all the input of the java program is occures
//there is no problem 
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//     //     System.out.println("****");
//     //       System.out.println("***");
//     //        System.out.println("**");
//     //         System.out.println("*");
//     //         int a=25;
//     //         String name="tony stark";
//     //         // char name="silu";
//     //          System.out.println(a);
//     //           System.out.println(name);
//     //           a=50;
//     //           System.out.println(a);
//     // }
//     // byte b=8;
//     // System.out.println(b);
//     // char ch='n';
//     // System.out.println(ch);
//     // int a=10;
//     // int b=25;
//     // int sum=a+b;
//     // System.out.println(sum);
// }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String input=sc.next();
//         System.out.println(input); 
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         System.out.println("hello world");
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("enter your name");
//  String name=sc.next();
// //  System.out.println(name);
//  System.out.println("eneter your age");
//  int age=sc.nextInt();
// //  System.out.println(age);
 
//         System.out.println("Hello, " + name + "! You are " + age + " years old.");

//         sc.close();
 
 

//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[]arg){
//         Scanner sc=new Scanner(System.in);
//          String name=sc.nextLine();
//          System.out.println(name);
//           Float price=sc.nextFloat();
//           System.out.println(price);


//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter first number");
//          int a=sc.nextInt();
//          System.out.println("enter second number");
//          int b=sc.nextInt();
//          int product=a*b;
//          System.out.println("the product is"+product);
//          System.out.println(product);
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//          int sum=a+b;
//          System.out.println(sum);

//     }}
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//      String name=sc.next();
//      System.out.println(name);
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int product=a*b;
//         System.out.println(product);
//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         float r=sc.nextFloat();
//         float area=3.14f*r*r;
//         System.out.println(area);

//     }
// }
//type casting
// public class Main{
//     public static void main(String[] args) {
//          float marks=(float)(99);
//         System.out.println(marks);
//     }
// }
//if else condition program
// import java.util.*;
// public class Main {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter your age");
//     int age=sc.nextInt();
//     if (age >=18) {
//         System.out.println("can drive "+"and eligible for vote");
        
//     }
//     else{
//         System.out.println("not adult");
//     }

// }
// }
//if a number is even or odd
//  import java.util.*;
//  public class Main {
//  public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the numbner");
//     int num=sc.nextInt();
//     if (num%2==0) {
//      System.out.println("it is a even number");   
//     }
//     else{
//         System.out.println("it is a odd number");
//     }
//  }
// }
//income tax calculetor
//  import java.util.*;
//  public class Main {
//  public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the income");
// int income=sc.nextInt();
// int tax;
// if (income<500000) {
//     tax=0;
// } 
// else if(income >=500000 && income <1000000){
// tax=(int)(income*0.2);
// }
// else{
//     tax=(int) (income*0.3);
// }
// System.out.println("your tax is "+tax);

// }
// }
//greatest of three number
// import java.util.*;
//  public class Main {
//  public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the three number");
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();

// if (a>b) {
//  if(a>c){
//     System.out.println("the greatest number is"+a);
//  }  
//  else{
//     System.out.println("the greatest number is "+c);
//  }
// }
//  else if(b>c){
//     System.out.println("the greatest number is"+b);
//  }
//  else{
//     System.out.println("the number is invalid");
//  }
// }
// }
//ternary operator
// import java.util.*;
// public class Main{
// public static  void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the marks");
//     int marks=sc.nextInt();
//     String type=(marks >=33)?"pass":"fail";
//     System.out.println(type);


// }
// }
//create the calculator
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the first number");
// int a=sc.nextInt();
// System.out.println("enter the second number");
// int b=sc.nextInt();
// System.out.println("enter the operator:");
// char operator=sc.next().charAt(0);
// switch (operator) {
//     case '+':System.out.println(a+b);
        
//         break;
//         case '-':System.out.println(a-b);
//         break;
//         case '*':System.out.println(a*b);
//         break;
//         case '/':System.out.println(a/b);
//         break;

//     default:System.out.println("invalid");
//         break;
// }
//     }
// }
//loop
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int range=10;
//         int n=1;
//               while (n<=range) {
//            System.out.println(n +""); 
//            n++;
//         }


//     }

// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int num=sc.nextInt();
//         int i;
//         int sum=0;
//         for(i=0;i<=num;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);
       
//     }
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int rem;
//         for(;num>0;) {
//             rem=num%10;
//             System.out.print(rem);
//             num=num/10;
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[]args){
// Scanner sc=new Scanner(System.in);
// int num=sc.nextInt();
// int i;

// while(true){
//     if (num%10==0) {
//         continue;
//     }
//     System.out.println( "the number is"+num);

// }

//     }
// }
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter your number");
            int num=sc.nextInt();
            if (num%10==0) {
                break;
            }
            System.out.println("the number is"+num);
        }while(true);
    }
}
  








