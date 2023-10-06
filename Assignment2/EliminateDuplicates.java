// import java.util.*;
// public class EliminateDuplicates {
//     public static void main(String[] args) {
//         int[] mynumber = new int[10];
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter 10 numbers :");
//         int i;
//         for ( i = 0; i < mynumber.length; i++);{
//             mynumber[i] = input.nextInt();
//         }
//         int[] distinctNumbers = eliminateduplicates(mynumber);
//         System.out.println("Distinct numbers :");
//         for ( i = 0; i < distinctNumbers.length; i++){
//             System.out.println(distinctNumbers[i]+ " ");
//         }

//     }
//     public static int[] eliminateduplicates(int[]list){
//         int[]distinct = new int[10];
//         int size = 0;
//         int i;
//         for ( i = 0; i < list.length; i++){
//             boolean isDuplicate = false;
//             int j;
//             for(j = 0; j < size; j++){
//                 if(list[i] == distinct[j]){
//                     isDuplicate = true;
//                 }
//             }
//             if (isDuplicate){
//                 distinct[size] = list[i];
//                 size++;
//             }
//         }
//         int[]result = new int[size];
//         System.arraycopy(distinct, 0, result, 0, size);
//         return result;

//     }
    
// }


import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (list[i] == distinctList[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                distinctList[count] = list[i];
                count++;
            }
        }

        int[] result = new int[count];
        System.arraycopy(distinctList, 0, result, 0, count);

        return result;
    }
}
