package Tutorials.Tutorial_8.Solution;

import java.util.Scanner;

// todo: create a custom exception (InvalidHexExceptions)

class InvalidHexExceptions extends RuntimeException{
    char wrongChar;
    public InvalidHexExceptions(char wrongChar){
        this.wrongChar = wrongChar;

    }

    @Override
    public String toString() {
        return "The character "+ wrongChar + " is not Hex character";
    }
}
public class HexToDec {

    //convertToInt method will throw InvalidHexExceptions if
    //  the value is not in a valid format
    //todo: handel non-Hex character by using InvalidHexExceptions
    public static int[] convertToInt(String hexadecimal)
    {
        int[] ints = new int[hexadecimal.length()];

        for(int i=0 ; i<hexadecimal.length(); i++){
            char currChar = hexadecimal.charAt(i);
                if(currChar >= '0' && currChar <= '9')
                    ints[i] = currChar - '0';
                else if( currChar >= 'a' && currChar <= 'f')
                    ints[i] = currChar - 'a' + 10;
                else if( currChar >= 'A' && currChar <= 'F')
                    ints[i] = currChar - 'A' + 10;
                else throw new InvalidHexExceptions(currChar);

        }
        return ints;
    }

    static int convertToDec(int intEq[]) {
        int result = 0;
        int mult = 1;    //multiplier
        for (int j = intEq.length - 1; j >= 0; j--) {
            result += intEq[j]*mult;
            mult *= 16;
        }
        return result;
    }

    
    public static void main(String args[]) {
        String hex;
        int intEq[];
        Scanner input = new Scanner(System.in);

            // Receive hex value from a user
            System.out.print("Enter a hexadecimal string: ");
            hex = input.next();

            // convertToInt() method will throw InvalidHexExceptions if
            // the value is not in a valid format
            intEq = convertToInt(hex);

            int dec = convertToDec(intEq);

            // Display the result
            System.out.println("The string in decimal: " + dec);


    }

}

