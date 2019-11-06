package Chap12;

import java.util.Scanner;

public class Hex2Dec {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a hex number: ");
    try {
      String hex = input.nextLine();

      System.out.println("The decimal value for hex number "
              + hex + " is " + hexToDec(hex.toUpperCase()));
    } catch (NumberFormatException ex){
      System.out.println(ex.toString());
    }

  }

  public static int hexToDec(String hexString) throws NumberFormatException{
    int decimalValue = 0;
    for (int i = 0; i < hexString.length(); i++) {
      char hexChar = hexString.charAt(i);
      if ((hexChar>='A'&& hexChar <='F') || (hexChar>='0'&&hexChar<='9'))
      {
        decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
      }
      else
        throw new NumberFormatException("输入必为数字0~9或者字母a~f");
    }
    return decimalValue;
  }

  public static int hexCharToDecimal(char ch) {
    if (ch >= 'A' && ch <= 'F')
      return 10 + ch - 'A';
    else // ch is '0', '1', ..., or '9'
      return ch - '0';
  }
}
