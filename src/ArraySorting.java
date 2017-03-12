import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ArraySorting {
	Scanner key = new Scanner(System.in);
public static void main(String[] args) {
	ArraySorting x = new ArraySorting();
}
ArraySorting(){
	int [] arrayee = {5,6,7};
	int [] array = new int[10];
	String [] arrayy = new String[10];
	for (int i = 0; i < arrayy.length; i++) {
		arrayy[i] = key.nextLine();
	}
	Arrays.sort(arrayy);
	for (int i = 0; i < arrayy.length; i++) {
		System.out.println(arrayy[i]);
	}
}

}
