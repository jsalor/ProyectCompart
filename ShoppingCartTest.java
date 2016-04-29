import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;



public class ShoppingCartTest {
	
ShoppingCart s1,s2;
	
	public ShoppingCartTest(ShoppingCart s1, ShoppingCart s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	

		@Parameters
		public static ArrayList<StringArrayUtils[]> misValores() {
			ArrayList<StringArrayUtils[]> parametros = new ArrayList<StringArrayUtils[]>();
			StringArrayUtils p1 = new StringArrayUtils(new String[]{"ssrsd","rtdxre"});
			StringArrayUtils p2 = new StringArrayUtils(new String[]{"12345"});
			StringArrayUtils[] arrayStringArrayUtils = new StringArrayUtils[2];
			arrayStringArrayUtils[0] = p1;
			arrayStringArrayUtils[1] = p2;
			parametros.add(arrayStringArrayUtils);
			return parametros;
		}
	

	@Test
	public void testShoppingCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetItemCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

}
