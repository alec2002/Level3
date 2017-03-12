import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ArrayListPuzzles {
	Scanner kb = new Scanner(System.in);
	Random r;
public static void main(String[] args) {
	ArrayListPuzzles x = new ArrayListPuzzles();
}
ArrayListPuzzles(){
	r = new Random();
	ArrayList<String> food = new ArrayList<String>();
	food.add("Bread");
	food.add("Chicken");
	food.add("Steak");
	
	int x = r.nextInt(food.size());
	System.out.println(food.get(x));
	
	ArrayList<String> jokes = new ArrayList<String>();
	jokes.add("Wanna hear a joke about construction?");
	jokes.add("Whats the difference between a ferrari and a ice chest full of dead babies?");
	jokes.add("Why did the chicken cross the road?");
	
	ArrayList<String> jokesp = new ArrayList<String>();
	jokesp.add("Oh wait i'm still working on it");
	jokesp.add("I don't have a ferrari in my garage");
	jokesp.add("To get to the other side");

	int g = r.nextInt(jokes.size());
	System.out.println(jokes.get(g));
	kb.next();
	System.out.println(jokesp.get(g));
	
ArrayList<String> band = new ArrayList<String>();
band.add("Hairy");
band.add("Smelly");
band.add("Tall");

ArrayList<String> bande = new ArrayList<String>();
bande.add("gofer");
bande.add("turtle");
bande.add("baby");
	
int t = r.nextInt(band.size());
int tt = r.nextInt(bande.size());
System.out.println(band.get(t) + "" + bande.get(tt));

ArrayList<Integer> xx = new ArrayList<Integer>();
for (int i = 0; true; i++) {
	xx.add(i+1);
	System.out.println(i);
}

}
}
