package HomeWork;

public class StoryAboutMe {
    public static void main(String[] args) {
        String name = "Karina";
        String surname = "Kulakova";
        String childrens = "boy and girl";
        String boyName = "Aleksej";
        String girlName = "Alisa";
        String favouriteToyOfGirl = "Doll";
        String favouriteToyofBoy = "Lego";
        System.out.println("My name is: " + name+ " " + "and my surname is: "+ ""+surname+". "+'\n'+ "I am happy person"
                + ". "+ '\n'+"I have 2 childrens = "+childrens
                +". "+ '\n'+"Name of son is: " + boyName+" " +'\n'+"and name of daughter is: " + girlName + "." );
        //System.out.println("for sure it is: "+ favouriteToyofBoy);
        System.out.printf("Childrens were happy to take presents: \nSon wanted to take a: %s",favouriteToyofBoy);
        System.out.printf(" and daughter was happy with %s", favouriteToyOfGirl+'.');

    }
}
