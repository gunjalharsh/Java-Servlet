import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class StudTest1 {
	
	Student s1=new Student();

	@Test
	public void test() {
		
		
		
		
		s1.setSid(8549);
		s1.setName("Harshal");
		assertEquals(8549,s1.getSid());
		assertEquals("Harshal",s1.getName()); //success
		
		
	}
	
			@Test

				public void demoTest() {
				int [] arr= {1,2,3,4};
				int [] arr1= {1,2,3,4};
				assertArrayEquals(arr1,arr);
				
				
				//Equals only check the values
				String s1="Harshal";
				String s2="HArshal";//fail Case Sensitive
				String s3="Harshal";
				assertEquals(s1,s3);
				
				
				String s4=new String("Harshal");
				String s5=new String("Harshal");
			//	assertSame(s4,s5);//fail
				String s6=s4;
				assertSame(s4,s6);//success
				
		
				
			}
			
			
}
