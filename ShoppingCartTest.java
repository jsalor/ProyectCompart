import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ShoppingCartTest {
	
	
	Product pdc1;
	Product pdc2;
	Product pdc3;
	ShoppingCart Sc;
	
	
	
	
	
	
	public ShoppingCartTest(Product pro1,Product pro2,Product pro3) {
		super();
		this.pdc1=pro1;
		this.pdc2=pro2;
		this.pdc3=pro3;
		
		
	}


	@Parameters
	public static ArrayList<Product[]> misValores(){
		ArrayList<Product[]>  parametros = new ArrayList<Product[]>();
		
		Product[] conpro = new Product[3];
		conpro[0] = new Product ("Peli1",20.5);
		conpro[1] = new Product ("Peli2",18.0);
		conpro[2] = new Product ("Peli3",27.1);
		parametros.add(conpro);
		
		
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
