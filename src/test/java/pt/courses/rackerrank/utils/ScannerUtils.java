package pt.courses.rackerrank.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Scanner utility for inject input and capture output data stream.
 *
 * @author Renan Souza
 *
 */
public class ScannerUtils {

	/**
	 * Custom output stream (System.out)
	 */
	public ByteArrayOutputStream baos;

	/**
	 * Default constructor
	 *
	 * @param data
	 *            input data stream
	 */
	public ScannerUtils(String data) {
		// inject input data in System.in
		ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes());
		System.setIn(bais);

		// create a custom System.out
		baos = new ByteArrayOutputStream();
		PrintStream custom = new PrintStream(baos);

		System.setOut(custom);
	}

	/**
	 * Get the output stream (System.out)
	 *
	 * @return The output stream (System.out)
	 */
	public String getOutput() {
		return baos.toString();
	}

}
