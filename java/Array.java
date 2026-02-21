// public class Array {
//     public static void prime(int n){
//         boolean prime=true;
//         if (n<2) {
//             prime=false;         
//         }
//         for(int i=2;i<=n-1;i++){
//             if (n%i==0) {
//                 prime=false;
//             }
//         }
//         if (prime) {
//             System.out.println("the number is prime number");
//         }
//         else{
//             System.out.println("the no is not prime");
//         }
//     }
//     public static void main(String[] args) {
//         prime(30);
//     }
// }
public class Array {

    public static void prime(int n){
        if (n<2) {
            System.out.println("this is not a prime number");
        }
        for(int i=2;i <= Math.sqrt(n);i++){
            if (n%i) {
                System.out.println("this is not a prime number");
            }
        }
        System.out.println("the number is a prime number");

    }
    public static void main(String[] args) {
        prime(30);
    }
}
