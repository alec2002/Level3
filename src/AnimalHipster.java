import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AnimalHipster {
	String favanimal = "";
	ArrayList<String> animalHipsters = new ArrayList<String>();

	public ArrayList<String> findAnimalHipsters(
			HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {
		for (String s : network.keySet()) {
			String favAnimal = favoriteAnimals.get(s);
			for (String ss : network.get(s)) {
				if (favAnimal.equals(favoriteAnimals.get(s))) {
					animalHipsters.add(favAnimal);
				}
			}


		}
		return animalHipsters;

	}
}
