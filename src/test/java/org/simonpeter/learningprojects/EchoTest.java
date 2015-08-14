package org.simonpeter.learningprojects;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class EchoTest {

	@Test
	public void testEchoWithNoArgs() {
		PrintStream tmp = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));

		Echo.main(new String[]{});

		System.setOut(tmp);
		String result = new String(baos.toByteArray());
		assertEquals(System.getProperty("line.separator"), result);
	}

	@Test
	public void testEchoWithOnlyMinusN() {
		PrintStream tmp = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));

		Echo.main(new String[]{"-n"});

		System.setOut(tmp);
		String result = new String(baos.toByteArray());
		assertEquals("", result);
	}

	@Test
	public void testEchoWithHelloWorld() {
		PrintStream tmp = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));

		Echo.main(new String[]{"hello,", "world"});

		System.setOut(tmp);
		String result = new String(baos.toByteArray());
		assertEquals("hello, world"+System.getProperty("line.separator"), result);
	}

	@Test
	public void testEchoWithHelloWorldAndMinusN() {
		PrintStream tmp = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));

		Echo.main(new String[]{"-n", "hello,", "world"});

		System.setOut(tmp);
		String result = new String(baos.toByteArray());
		assertEquals("hello, world", result);
	}

	@Test
	public void testEchoWithLongArgList() {
		PrintStream tmp = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));

		Echo.main(new String[]{"alpha", "bravo", "charlie", "delta", "echo"});

		System.setOut(tmp);
		String result = new String(baos.toByteArray());
		assertEquals("alpha bravo charlie delta echo"+System.getProperty("line.separator"), result);
	}
}
