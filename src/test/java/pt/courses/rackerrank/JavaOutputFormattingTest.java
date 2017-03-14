package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.Test;

import pt.courses.rackerrank.utils.ScannerUtils;

public class JavaOutputFormattingTest {

	String inputData;

	/**
	 * Input (stdin)
	 *
	 * java 100
	 *
	 * cpp 65
	 *
	 * python 50
	 */
	@Test
	public void testName2() {
		StringBuilder expected = new StringBuilder();
		expected.append("================================\n");
		expected.append("java            100\n");
		expected.append("cpp             065\n");
		expected.append("python          050\n");
		expected.append("================================\n");

		inputData = "java 100\ncpp 65\npython 50\n";
		ScannerUtils scannerUtils = new ScannerUtils(inputData);
		JavaOutputFormatting.main(null);
		Assert.assertEquals(expected.toString(), scannerUtils.getOutput());
	}

	/**
	 * Input (stdin)
	 *
	 * hello 0
	 *
	 * hackerrank 65
	 *
	 * java 10
	 */
	@Test
	public void testName() {
		StringBuilder expected = new StringBuilder();
		expected.append("================================\n");
		expected.append("hello           000\n");
		expected.append("hackerrank      065\n");
		expected.append("java            010\n");
		expected.append("================================\n");

		inputData = "hello 0\nhackerrank 65\njava 10\n";
		ScannerUtils scannerUtils = new ScannerUtils(inputData);
		JavaOutputFormatting.main(null);
		Assert.assertEquals(expected.toString(), scannerUtils.getOutput());
	}



}
