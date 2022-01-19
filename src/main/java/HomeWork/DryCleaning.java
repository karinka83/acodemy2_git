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

