package org.joda.time.converters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {

	    public TestAll(String testName) {
	        super(testName);
	    }

	    public static Test suite() {
	        TestSuite suite = new TestSuite();
	        suite.addTest(TestConverters.suite());
	        
	        return suite;
	    }

	    public static void main(String args[]) {
	        String[] testCaseName = {
	            TestAll.class.getName()
	        };
	        junit.textui.TestRunner.main(testCaseName);
	    }

	}

