package on2013_06.on2013_06_07_June_Challenge_2013.Dessert_Wizard;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2013_06/on2013_06_07_June_Challenge_2013/Dessert_Wizard/Dessert Wizard.task"))
			Assert.fail();
	}
}
