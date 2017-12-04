import java.util.ArrayList;
import java.util.Arrays;


public class StockMarket {
	float ff = 0;
	
float maxProfit(ArrayList <Float>stock){
	for (Float f: stock) {
		if (f > ff) {
			ff = f;
		}	
		System.out.println(ff);
	}
	
	return ff;
	
}
}
