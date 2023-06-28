package Day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int res = test.square(4);
		assertEquals(16,res);
	}

}
