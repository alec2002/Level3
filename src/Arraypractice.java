import java.util.Scanner;


public class Arraypractice {
	Scanner key = new Scanner(System.in);
public static void main(String[] args) {
	Arraypractice x = new Arraypractice();
}
Arraypractice(){
	int[] array = new int[10];
	
	for (int i = 0; i < array.length; i++) {
		array[i] = key.nextInt();
		System.out.println("Assign number" + i);
		
		
	}
	for (int i = 0; i < array.length; i++) {
		
		System.out.println(array[i]);
	}
}
}
