package de.tu_darmstadt.jsf18.critblock.tests.tutors.suites;

import de.tu_darmstadt.jsf18.critblock.ui.Launch;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestsuiteMinimal {
	
	public static Test suite() {
		
		TestSuite suite = new TestSuite("Tutor tests for " + Launch.TITLE + " - Minimal");

		return suite;
	}
}
