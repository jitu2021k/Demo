import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class CalTest {
	private Cal c = new Cal();
	
	@BeforeAll
	public static void print() {
		System.out.println("Before All");
	}
	
	@AfterEach
	public  void printLast() {
		System.out.println("After Each");
	}
	
	
	@Test
	void testsum() {
		int expRes=10;
		int acRes = c.doSum(3, 4, 3);
		Assert.assertEquals(expRes, acRes);
		
	}
	
	@Test
	void testSub() {
		int acRes = c.doSub(10, 5);
		int expRes =5;
		Assert.assertEquals(expRes, acRes);
	}
	
	@Test
	void testMultiply() {
		int acRes = c.doMultiplication(10, 5);
		int expRes =50;
		Assert.assertEquals(expRes, acRes);
	}
	
	@Test
	void testdivision() {
		int acRes = c.doDivision(100, 5);
		int expRes =20;
		Assert.assertEquals(expRes, acRes);
	}
}
