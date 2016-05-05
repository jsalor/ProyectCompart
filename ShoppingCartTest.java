import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;




@RunWith(Parameterized.class)
public class ShoppingCartTest {
	
	
	/*Product pdc1;
	Product pdc2;
	Product pdc3;*/
	ShoppingCart Sc;
	ShoppingCart Sc2;
	
	
	
	
	
	public ShoppingCartTest(ShoppingCart sc1,ShoppingCart sc2) {
		super();
		
		 this.Sc=sc1;
		 this.Sc2=sc2;
		
		/*this.pdc1=pro1;
		this.pdc2=pro2;
		this.pdc3=pro3;*/
		
		/*Sc.addItem(pdc1);
		Sc.addItem(pdc2);
		Sc.addItem(pdc3);*/
		
		
	}


	@Parameters
	public static ArrayList<Product[]> misValores(){
		ArrayList<Product[]>  parametros = new ArrayList<Product[]>();
		
		Product[] conpro = new Product[3];
		conpro[0] = new Product ("Peli1",20.5);
		conpro[1] = new Product ("Peli2",18.0);
		conpro[2] = new Product ("Peli3",27.1);
		parametros.add(conpro);
		
		Product[] conpro2 = new Product[3];
		conpro2[0] = new Product ("Peli4",27.1);
		conpro2[1] = new Product ("Peli5",20.5);
		conpro2[2] = new Product ("Peli6",18.0);
		parametros.add(conpro);
		
		
		return parametros;
	}
	
	

	@Test
	public void testGetBalance() {
		
		Assert.assertEquals(Sc.getBalance(),Sc2.getBalance());
	
		
	}

	@Test
	public void testAddItem() {
		
	}

	@Test
	public void testRemoveItem() {
		
	}

	@Test
	public void testGetItemCount() {
		
	}

	@Test
	public void testEmpty() {
		
	}

	@Test
	public void testIsEmpty() {
		
	}

}
