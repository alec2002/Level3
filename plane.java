import java.util.ArrayList;


public class plane {
	int totalvic; 
	
	Snake s;
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	int numberOfPassengers;
	public static void main(String[] args) {
		plane x = new plane();
	}
plane(){
	Randomness r = new Randomness();
	
for (int i = 0; i < 100; i++) {
	 s = new Snake(r.num(), r.tf());
	 snakes.add(s);
}
for (Snake s: snakes) {
	if (s.getVenemous() == true) {
		totalvic += s.getViciousness();
	}
	
}
int chanceofdeath = (totalvic*10)/100;

System.out.println(chanceofdeath);

}
}
