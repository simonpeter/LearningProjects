package org.simonpeter.learningprojects;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testHelloWorld() {
		PrintStream tmp = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));

		Hello.main(null);

		System.setOut(tmp);
		String result = new String(baos.toByteArray());
		assertEquals("hello, world"+System.getProperty("line.separator"), result);
	}
}
