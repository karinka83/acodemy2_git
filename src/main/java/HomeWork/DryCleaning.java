//Task Nr. 02
/* В переменной типа int хранится любое число от 18 до 65.
 Скидку в химчистке можно получить группе лиц от 18-21 лет в размере 10 процентов.
 Группе лиц от 22 до 65 лет можно получить скидку в размере 15%.
 Группе лиц от 65 можно получить скидку в размере 20%.

 */


package HomeWork;

public class DryCleaning {
    public static void main(String[] args) {
        int years = 67;
        if (years < 18) {
            System.out.println("Your age is incorrect, please choose a different value");
        } else if (years >= 18 && years <= 21) {
            System.out.println("You are student, you have earned a discount 10% ");
        } else if (years >= 22 && years <= 65) {
            System.out.println("Dear friend, I can give you a discount 15%");
        } else
            System.out.println("My congratulations, you have a discount 20%");
    }
}

