import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the option \n 1 - Greatest of three numbers \n 2- Smallest of three numbers \n 3 - Is the given number is prime or not \n " +
                "4 - Is the given number is even or not \n 5 - Revers the given number \n 6 - Exit");
         int n = input.nextInt();
         if (n == 6){
             System.out.println("You are exiting from the program");
         }
         else{
             switch (n) {

                 case 1 :
                     System.out.println("Enter three numbers");
                     Scanner obj1 = new Scanner(System.in);
                     int num1 = obj1.nextInt();
                     int num2 = obj1.nextInt();
                     int num3 = obj1.nextInt();
                     int greatest = (num1 > num2 )? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
                     System.out.println("Greatest of the given three numbers is " + greatest);
                     break;

                 case 2 :
                     System.out.println("Enter three numbers");
                     Scanner obj2 = new Scanner(System.in);
                     int n1 = obj2.nextInt();
                     int n2 = obj2.nextInt();
                     int n3 = obj2.nextInt();
                     int smallest = (n1 < n2 )? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
                     System.out.println("Greatest of the given three numbers is " + smallest);
                     break;

                 case 3 :
                     int f = 0;
                     System.out.println("Enter a number other than '0' and '1'");
                     Scanner obj3 = new Scanner(System.in);
                     int x = obj3.nextInt();
                     for (int i = 2 ; i < x ; i++){

                         if (x % i == 0){

                             f = 1;
                             break;
                         }
                     }
                     if (f == 1){
                         System.out.println("The given number is not prime");
                     }
                     else {
                         System.out.println("The given number is prime");
                     }
                     break;

                 case 4 :
                     System.out.println("Enter a number");
                     Scanner obj4 = new Scanner(System.in);
                     int y = obj4.nextInt();
                     if (y % 2 == 0) {
                         System.out.println("Given number is even");
                     }
                     else {
                         System.out.println("The given is not even");
                     }
                     break;


                 case 5 :
                     System.out.println("Enter a number");
                     Scanner obj5 = new Scanner(System.in);
                     int z = obj5.nextInt();
                     int temp = 0;
                     while(z != 0) {

                         temp =  temp * 10 + z % 10;
                         z = z /10;

                     }
                     System.out.println("Reverse of the given number is " + temp);
                     break;

                 default:
                     System.out.println("Choose a valid option");

             }

             }
         }
    }
