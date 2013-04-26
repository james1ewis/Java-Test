package org.katas.checkout.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CheckoutTest extends TestCase
{
    public CheckoutTest( String testName )
    { 
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( CheckoutTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
