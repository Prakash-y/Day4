package Day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountA {

	
	@Test
	public void countA()
	{
		System.out.println("Testing count A ");
		assertEquals(2,JunitTesting.countA("Java"));
	}

}
