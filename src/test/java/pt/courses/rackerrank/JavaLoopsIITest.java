package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.Test;

import pt.courses.rackerrank.utils.ScannerUtils;

public class JavaLoopsIITest {

    private ScannerUtils utils = new ScannerUtils();

    @Test
    public void testMath() throws Exception {

	utils.setInputFile("JavaLoopsII/in1");
	utils.setOutputFile("JavaLoopsII/out1");
	JavaLoopsII.main(null);
	Assert.assertEquals(utils.getExpected(), utils.getResult());
    }
}