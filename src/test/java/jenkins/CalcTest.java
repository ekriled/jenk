package jenkins;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalcTest {
	@Test
	public void addTest() {
		AssertJUnit.assertEquals(10, Calculator.addNumbers(5, 5));
	}

	@Test
	public void subtractTest() {
		AssertJUnit.assertEquals(5, Calculator.subtractNumbers(10, 5));
	}
}