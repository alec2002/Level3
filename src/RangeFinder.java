import java.util.Scanner;


public class RangeFinder {
	int x = 1;
	int highest = 0;
	int smallest = 0;
	Scanner keyboard = new Scanner(System.in);
public static void main(String[] args) {
	RangeFinder ddd = new RangeFinder();
}
RangeFinder(){
	RS();
}
void RS(){
	while(x!=0){
		x = keyboard.nextInt();
		System.out.println(x);
		if (x > highest) {
			highest = x;
		}
		if (x < highest) {
			smallest = x;
		}
		
	}
	
}
}
