import java.util.ArrayList;


public class Decorator {
	public static void main(String[] args) {
		ArrayList<Ornament> boxofDecorations = new ArrayList<Ornament>();
		boxofDecorations.add(new Ornament());
		boxofDecorations.add(new Ornament());
		boxofDecorations.add(new Ornament());
		for (Ornament o: boxofDecorations) {
			o.hang("red");
		}
	}

}
