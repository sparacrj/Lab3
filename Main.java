import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a Number to count up or down from");

    int s = myObj.nextInt();

    if (s > 0)
    {
      while (s > 0)
        {
        System.out.println(s - 1);
        s--;
        }
    }
    
    else
    {
      while (s < 0)
        {
          System.out.println(s + 1);
          s++;
        }
    }

    System.out.println("Blast Off!");
  }
}