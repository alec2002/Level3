import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

public class tessts {


	@Test
	public void testStrings() {
	
		String s1 = "ladder";
		String s2 = "computer";
		String s3 = "Mississippi";
		
		assertTrue(hasRepeatingChar(s1));
		assertFalse(hasRepeatingChar(s2));
		assertTrue(hasRepeatingChar(s3));
		
	}
	
	@Test
	public void testArrays() {
	int[] a1 = {10,20,50,100};
	int[] a2 = {5,10,25,50};
		assertArrayEquals(a2,reduceArrayByHalf(a1));
		
	}

public int[] reduceArrayByHalf(int[] a1) {
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
			a1[i] = a1[i]/2;

		}
		
		return a1;
	}

boolean hasRepeatingChar(String s){
	ArrayList<Character> clist = new ArrayList<Character>();
	for (int i = 0; i < s.length(); i++) {
		if (clist.contains(s.charAt(i))) {
			return true;
		}else{
			clist.add(s.charAt(i));
		}
	}
	return false;
	
}

}

