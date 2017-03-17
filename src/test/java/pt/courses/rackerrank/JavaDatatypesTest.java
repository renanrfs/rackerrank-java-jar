package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.Test;

import pt.courses.rackerrank.utils.ScannerUtils;

public class JavaDatatypesTest {

    private ScannerUtils utils = new ScannerUtils();

    @Test
    public void test1() throws Exception {
	utils.setInputFile("JavaDatatypes/in1");
	utils.setInputFile("JavaDatatypes/out1");
	JavaDatatypes.main(null);
	Assert.assertEquals(utils.getExpected(), utils.getResult());
    }

}
