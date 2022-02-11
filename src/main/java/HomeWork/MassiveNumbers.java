/* 4. Создать массив с числами от 0 до 10 и распечатать только те четные числа.
 */

package HomeWork;

public class MassiveNumbers {

    public static void main(String[] args) {
        /*int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(digits);
        }
        int[] numbers = {0, 1, 1, 3, 4, 5, 4, 6, 7};
        for (int i = 0; 1 < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
     */
        //int[] numbersss = {0, 1, 1, 3, 2, 5, 7, 4, 6, 6, 8, 10, 9, 10};
        int[] numbersss = new int[10];

        for (
                int q = 0;
                q <= numbersss.length - 1; q++) {
            numbersss[q] = q + 1;
        }
        for (
                int digit : numbersss) {
            if (digit % 2 == 0) {
                System.out.println(digit);
            }
        }
    }
}