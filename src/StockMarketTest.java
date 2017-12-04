import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class StockMarketTest {
	ArrayList <Float> arrayl = new ArrayList<Float> (Arrays.asList(100.5f,2.00f,10.09f,3.53f));
	@Test
	void testmaxProfit(){
		StockMarket stock = new StockMarket();
		assertEquals(stock.maxProfit(arrayl), );
	}
	public void test() {
		fail("Not yet implemented");
	}

}
