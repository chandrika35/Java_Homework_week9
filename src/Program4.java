import java.util.ArrayList;

public class Program4 {
    /**
     * 4. Write a Java program to create a new array list,
     * add some colours (string) and printout the collection using for each loop.
     */

    public static void main(String[] args) {
        Colours();

    }

    public static void Colours() {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Brown");
        colours.add("Pink");
        colours.add("Blue");
        colours.add("Grey");
        colours.add("White");
        System.out.print("ArrayList:" + colours);


        System.out.println("   Iterating over ArrayList using for-each loo[p:");

        for (String colour : colours) {
           //For each loop getting values and assigning to colour object
System.out.println(colour);
System.out.print("");

        }
    }


}