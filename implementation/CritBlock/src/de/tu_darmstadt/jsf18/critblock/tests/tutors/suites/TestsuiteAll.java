package de.tu_darmstadt.jsf18.critblock.tests.tutors.suites;

import de.tu_darmstadt.jsf18.critblock.ui.Launch;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestsuiteAll {
	
	public static Test suite() {
		
		TestSuite suite = new TestSuite("All tutor tests for " + Launch.TITLE);
		
		return suite;
	}
}
