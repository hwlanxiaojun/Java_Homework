package Chap12;

import java.util.Scanner;

/**
 * @Author Lan XiaoJun
 * @Date 2019/10/22 21:28
 * @Version 1.0
 **/
class HexFormatException extends NumberFormatException {
    public HexFormatException(){
        super("输入必为数字0~9或者字母a~f");
    }
}
public class CustomHex2Dec {
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
        } catch (HexFormatException ex){
            System.out.println(ex.toString());
        }

    }

    public static int hexToDec(String hexString) throws HexFormatException{
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            if ((hexChar>='A'&& hexChar <='F') || (hexChar>='0'&&hexChar<='9'))
            {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
            else
                throw new HexFormatException();
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
