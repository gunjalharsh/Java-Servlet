import static org.junit.Assert.*;

import org.junit.Test;

import StudTest1.Division;

public class DivTest {

	
	Division obj1=new Division(10,2);
	Division obj2=new Division(10,0);
	@Test
	public void test() {

	System.out.println("First Test Case");
	assertEquals(5,obj1.division());
	
	
	
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void test1() {
		
		System.out.println("Second test class");
		assertEquals(5,obj2.division());
		
	}
	@Test(expected=ArithmeticException.class)
	
	public void ArithExcep2() {
		
		throw new NullPointerException();//fail
		
		
	}


}
