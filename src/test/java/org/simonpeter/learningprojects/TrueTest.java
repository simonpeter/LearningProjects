package org.simonpeter.learningprojects;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class TrueTest {

	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	@Test
	public void testTrue() {
		exit.expectSystemExitWithStatus(1);
		True.main(null);
	}
}
