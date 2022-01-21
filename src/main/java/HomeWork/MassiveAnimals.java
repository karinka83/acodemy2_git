/*3. Создать массив String и добавить в него 10 наименований животных.
        a Пройтись циклом по массиву, найти и распечатать любого животного.

 */

package HomeWork;

import java.util.Arrays;

public class MassiveAnimals {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "cow", "monkey", "tiger", "camel", "lion", "hamster", "rat", "horse"};
        //System.out.println(animals[0]);
        //ystem.out.println(animals[1]);
        //System.out.println(animals[9]);
        for (int i = 2; i < 3; i++) {
            System.out.println(animals[i]);

            //for (String animal : animals) {
            //System.out.println("tiger");
        }
    }
}
