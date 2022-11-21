import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the option \n 1 - Greatest of three numbers \n 2- Smallest of three numbers \n 3 - Is the given number is prime or not \n " +
                "4 - Is the given number is odd or even \n 5 - Revers the given number \n 6 - Exit");
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

                 case 2 :
                     System.out.println("Enter three numbers");
                     Scanner obj2 = new Scanner(System.in);
                     int n1 = obj2.nextInt();
                     int n2 = obj2.nextInt();
                     int n3 = obj2.nextInt();
                     int smallest = (n1 < n2 )? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
                     System.out.println("Greatest of the given three numbers is " + smallest);
             }

             }
         }
    }
}