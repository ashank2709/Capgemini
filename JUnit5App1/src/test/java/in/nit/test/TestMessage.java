package in.nit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestMessage {
	
	@Test
	public void testA() {
		String expected="hello";
		String actual= "hello";
		Assertions.assertEquals(expected,actual);
		
	}

}
