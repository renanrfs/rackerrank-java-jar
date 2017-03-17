package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.Test;

import pt.courses.rackerrank.utils.ScannerUtils;

public class JavaOutputFormattingTest {

    private ScannerUtils utils = new ScannerUtils();

    @Test
    public void testList1() {
	utils.setInputData("java 100\ncpp 65\npython 50\n");
	utils.setOutputFile("JavaOutputFormatting/out1");
	JavaOutputFormatting.main(null);
	Assert.assertEquals(utils.getExpected(), utils.getResult());
    }

    @Test
    public void testList2() {
	utils.setInputData("hello 0\nhackerrank 65\njava 10\n");
	utils.setOutputFile("JavaOutputFormatting/out2");
	JavaOutputFormatting.main(null);
	Assert.assertEquals(utils.getExpected(), utils.getResult());
    }
}
