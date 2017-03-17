package pt.courses.rackerrank.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Scanner utility for inject input and capture output data stream.
 * 
 * @author Renan Souza
 * 
 */
public class ScannerUtils {

    private static final String PATH = "src/test/files/";
    /**
     * Custom input stream (System.in)
     */
    private ByteArrayInputStream bais;
    /**
     * Custom output stream (System.out)
     */
    protected ByteArrayOutputStream baos;
    /**
     * Default output stream (System.out)
     */
    protected PrintStream previous;
    /**
     * Expected result
     */
    protected StringBuilder expected;

    /**
     * Default constructor.
     */
    public ScannerUtils() {
	previous = System.out;
	expected = new StringBuilder();

	// create a custom System.out
	baos = new ByteArrayOutputStream();
	PrintStream custom = new PrintStream(baos);

	System.setOut(custom);
    }

    /**
     * Set input data from Stream.
     * 
     * @param stream
     *            Input data stream.
     */
    private void setInputStream(InputStream stream) {
	// inject input data in System.in
	System.setIn(stream);
    }

    /**
     * Set input data value.
     * 
     * @param data
     *            Input data value.
     */
    public void setInputData(String data) {
	// inject input data in System.in
	bais = new ByteArrayInputStream(data.getBytes());
	setInputStream(bais);
    }

    /**
     * Set output data value.
     * 
     * @param data
     *            Output data value.
     */
    public void setOutputData(String data) {
	expected.append(data);
    }

    /**
     * Set input data from file.
     * 
     * @param filename
     *            Input data file.
     */
    public void setInputFile(String filename) {
	// inject input data in System.in
	try {
	    setInputStream(new FileInputStream(new File(PATH, filename)));
	} catch (FileNotFoundException e) {
	    throw new RuntimeException(e);
	}
    }

    /**
     * Set output data from file.
     * 
     * @param filename
     *            Output data file.
     */
    public void setOutputFile(String filename) {
	int data;
	try {
	    BufferedReader reader = new BufferedReader(new FileReader(PATH
		    + filename));
	    while ((data = reader.read()) != -1) {
		expected.append((char) data);
	    }
	} catch (IOException e) {
	    throw new RuntimeException(e);
	}
    }

    /**
     * Recover the default output stream (System.out) and print the result
     * value.
     */
    public void printResult() {
	System.setOut(previous);
	System.out.println(baos.toString());
    }

    /**
     * Get the result value.
     * 
     * @return The result value.
     */
    public String getResult() {
	return baos.toString();
    }

    /**
     * Get the expected result value.
     * 
     * @return The expected result value.
     */
    public String getExpected() {
	return expected.toString();
    }
}
