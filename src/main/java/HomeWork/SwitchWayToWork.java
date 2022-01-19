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
