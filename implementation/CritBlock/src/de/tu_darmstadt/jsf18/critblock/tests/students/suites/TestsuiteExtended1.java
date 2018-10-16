package de.tu_darmstadt.jsf18.critblock.tests.students.suites;

import de.tu_darmstadt.jsf18.critblock.ui.Launch;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestsuiteExtended1 {
	
	public static Test suite() {
		
		TestSuite suite = new TestSuite("Student tests for " + Launch.TITLE + " - Extended 1");
		
		return suite;
	}
	
}
