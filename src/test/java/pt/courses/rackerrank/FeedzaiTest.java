package pt.courses.rackerrank;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Unit test for simple App.
 */
@FixMethodOrder(MethodSorters.JVM)
public class FeedzaiTest extends Feedzai {

    private String[] a;
    private String[] b;

    @Test
    public void nullValueTest() {
	Assert.assertEquals(false, someContents(a, b));
    }

    @Test
    public void sameContentTest() {
	a = new String[] { "a", "b", "c" };
	b = new String[] { "a", "b", "c" };
	Assert.assertEquals(true, someContents(a, b));
    }

    @Test
    public void sameContentDiferentOrderTest() {
	a = new String[] { "a", "b", "c" };
	b = new String[] { "c", "b", "a" };
	Assert.assertEquals(true, someContents(a, b));
    }

    @Test
    public void sameContentDiferentLengthTest() {
	a = new String[] { "a", "b", "c", "b" };
	b = new String[] { "c", "b", "a" };
	Assert.assertEquals(false, someContents(a, b));
    }

    @Test
    public void diferentContentTest() {
	a = new String[] { "a", "b", "k" };
	b = new String[] { "a", "b", "c" };
	Assert.assertEquals(false, someContents(a, b));
    }

    @Test
    public void nullFriendlyWordsTest() {
	Assert.assertArrayEquals(null, friendlyWords(null));
    }

    @Test
    public void emptyFriendlyWordsTest() {
	Assert.assertArrayEquals(new String[0], friendlyWords(new String[0]));
    }

    @Test
    public void friendlyWordsTest() {
	String[] inputArray = { "silent", "deal", "teaching", "car",
		"cheating", "dale", "lead", "listen" };
	String[] outputArray = { "cheating teaching", "dale deal lead",
		"listen silent" };
	Assert.assertArrayEquals(outputArray, friendlyWords(inputArray));
    }

}
