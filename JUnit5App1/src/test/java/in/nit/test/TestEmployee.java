package in.nit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

public class TestEmployee {
	
	@BeforeEach
	public void setup() {
		
		System.out.println("FROM SETUP");
	}
	
	//test methods
	@Test
	public void testSave() {
		System.out.println("HELLO WORLD-save");
		}
	

}
