/* 5. Предположим что мы хотим выбрать транспортное средство на котором сегодня поедем в офис.
 Транспортом может быть (машина, автобус, такси и т.д).
 Относительно значения, которое храниться в переменной используя оператор switch;
 научить программу выводить на экран то, каким образом планируете добраться до работы.

 */

package HomeWork;

public class SwitchWayToWork {
    public static void main(String[] args) {

        String StartPoint = "Zepniekkalns";

        switch (StartPoint) {
            case "FlatStreet":
                System.out.println("Home");
                break;
            case "CityDrive":
                System.out.println("Drive around the city");
                break;
            case "Track":
                System.out.println("You are on track Jelgava-Riga");
                break;
            case "Zepniekkalns":
                System.out.println("Turn right after the road sign");
                break;
            default:
                System.out.println("Great! Go down and you are in office!");
        }
    }
}
