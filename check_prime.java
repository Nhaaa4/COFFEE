import java.util.Scanner;

public class check_prime {
  public static void main(String[] args) {
    boolean flag = false;
    Scanner myObj = new Scanner(System.in);

    System.out.print("Enter number: ");
    int num = myObj.nextInt();

    if (num < 2) {
      System.out.println(num + "is not a prime number");
      myObj.close();
      return;
    }
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag) {
      System.out.println(num + " is a prime number.");
      System.out.println("Ah thork");
    }
    else
      System.out.println(num + " is not a prime number.");

    myObj.close();
  }
}