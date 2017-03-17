package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.Test;

import pt.courses.rackerrank.utils.ScannerUtils;

public class JavaLoopsTest {

    private ScannerUtils utils = new ScannerUtils();

    @Test
    public void testMath() {
	utils.setInputData("2");
	utils.setOutputFile("JavaLoops/out1");
	JavaLoops.main(null);
	Assert.assertEquals(utils.getExpected(), utils.getResult());

    }
}
