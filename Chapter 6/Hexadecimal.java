// public class Hexadecimal {
//     public static void main(String[] args) {
        
//         int F = decimal(10,11,8,13);
//         System.out.println(F);

//     }
//     public static int decimal(int num1, int num2, int num3, int num4){
//         int answer =(int)((Math.pow(16,3)* num1 )+(Math.pow(16,2)*num2)+(16*num3)+num4);
//         return answer;
//     }
    
// }
public class Hexadecimal{

    public static void main(String[] args) {
        String hexNumber = "AB8C"; // Replace this with the hexadecimal number you want to convert

        int decimalNumber = hexToDecimal(hexNumber);
        System.out.println("Decimal equivalent of " + hexNumber + " is: " + decimalNumber);
    }

    public static int hexToDecimal(String hexNumber) {
        int decimalNumber = 0;
        int power = 0;

        for (int i = hexNumber.length() - 1; i >= 0; i--) {
            char c = hexNumber.charAt(i);
            int digitValue = hexCharToDecimal(c);
            decimalNumber += digitValue * Math.pow(16, power);
            power++;
        }

        return decimalNumber;
    }

    public static int hexCharToDecimal(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'F') {
            return 10 + (c - 'A');
        } else if (c >= 'a' && c <= 'f') {
            return 10 + (c - 'a');
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal character: " + c);
        }
    }
}
