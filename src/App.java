import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    /*N children stand in a circle, and they count from 1 to K starting from Player #1.
    This time Player #K gets excluded. They continue counting from the next player, #(K+1),
     and after each round one player leaves the circle.
    After N-1 rounds there will be one player standing, who wins the game.
     */

    public static void runModular() {
        List<String> children = new ArrayList<>(Arrays.asList("Alabaster", "Aurora", "Chase", "Empyrean", "Eternity",
                "Fragment", "Gallop", "Guerilla", "Instinct", "Magic" )); // "Pinnacle", "Ranger", "Realm", "Reflect", "Shadow", "Thunder", "Tradition"));
        int rounds = children.size();
        int count = 5;
        String res;
        for (int i = 0 ; i < rounds*count; i++) {
            if (i+1 % count == 0) {
                System.out.println(children.remove(i));
            }

            if ( j >= children.size())
                j = 0;
            System.out.println("kör " + i + " " + children.size());
        }
    }

    public static void runTT() {
        List<String> children = new ArrayList<>(Arrays.asList("Alabaster", "Aurora", "Chase", "Empyrean", "Eternity",
                "Fragment", "Gallop", "Guerilla", "Instinct", "Magic" )); // "Pinnacle", "Ranger", "Realm", "Reflect", "Shadow", "Thunder", "Tradition"));

        Iterator<String> iterator = children.iterator();
        int rounds = children.size();

        int count = 5;

        for (int i = 0; i < rounds-1; i++) {
            if (count >= children.size()) {
                System.out.println(children.size() + ", " + i);
                children.remove(0);
            } else {
                children.remove(count);
            }
            if (!iterator.hasNext()) {
                iterator = children.iterator();
            }
            System.out.println(children.size());
        }
        System.out.println(Arrays.asList(children));
    }

    public static void main(String[] args) {
        runTT();
        //runModular();
    } //nem engedi futtatni a runTT-t ha static
}
