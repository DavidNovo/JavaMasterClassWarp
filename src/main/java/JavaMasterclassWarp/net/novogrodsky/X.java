package JavaMasterclassWarp.net.novogrodsky;

import java.util.Scanner;

public class X {
  Integer x = null;

  public void getValueFromScreen() {

    System.out.println("enter an integer: ");
    // System.in means it reads from the command line
    Scanner scanner = new Scanner(System.in);

    //System.out.println("The number inputed was " + scanner.nextLine());
    x = Integer.parseInt(scanner.nextLine());

  }


  public void outputTimesTable() {
    for (int x = 0; x <= 12 ; x++) {
      System.out.println(x + " times " + this.x + " equals " + x * this.x);
    }
  }



}
