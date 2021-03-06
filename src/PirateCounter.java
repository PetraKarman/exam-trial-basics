// Write a function that takes any list that contains pirates as in the example,
// And returns a list of names containing the pirates that
// - have wooden leg and
// - have more than 15 gold

import java.util.ArrayList;
import java.util.List;

public class PirateCounter {
  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    System.out.println(pirateNames(pirates));
  }

  public static List<String> pirateNames(List<Pirate> input) {
    List<String> nameList = new ArrayList<>();

    for (Pirate x : input) {
      if (x.hasWoodenLeg && x.gold > 15) {
        nameList.add(x.name);
      }
    }
    return nameList;
  }
}


