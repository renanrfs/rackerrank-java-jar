package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.Test;

import pt.courses.rackerrank.utils.ScannerUtils;

public class JavaEndOfFileTest {

    private ScannerUtils utils = new ScannerUtils();

    @Test
    public void test1() throws Exception {
	utils.setInputFile("JavaEndOfFile/in1");
	utils.setOutputFile("JavaEndOfFile/out1");
	JavaEndOfFile.main(null);
	Assert.assertEquals(utils.getExpected(), utils.getResult());
    }
}
