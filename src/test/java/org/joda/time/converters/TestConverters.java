package org.joda.time.converters;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.TestBuilder;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(JUnitQuickcheck.class)
public class TestConverters extends TestCase {
	public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestBuilder.class);
    }

    @Property public void testConvertBuddhistYear(@From(LongGenerator.class) Long date)
        throws Exception {

        DateTime dt = new DateTime(date);
       int yearBeforeConvert = dt.getYear(); 
       
        DateTime dtBuddhist = dt.withChronology(BuddhistChronology.getInstance());
       int  dtBuddhistYear = dtBuddhist.getYear();  
        
        DateTime dtGregorian = dtBuddhist.withChronology(GregorianChronology.getInstance());
        int yearAfterConvert = dtGregorian.getYear();
        
        System.out.println(dtBuddhistYear+" "+yearAfterConvert);
        
        assertEquals(
            yearBeforeConvert,yearAfterConvert);
    }
}
