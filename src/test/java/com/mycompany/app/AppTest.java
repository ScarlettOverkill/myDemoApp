package com.mycompany.app;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }


    public void DogruTest(){
        ArrayList<Integer> liste = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertEquals(Arrays.asList(4,3,2,1),new App().TersCevir(liste));
    }

    public void HataliTest(){
        ArrayList<Integer> liste = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertNotSame(Arrays.asList(4,2,1,3),new App().TersCevir(liste));
    }


    public void TekElemanVar(){
        ArrayList<Integer> liste = new ArrayList<Integer>(Arrays.asList(1));
        assertEquals(null,new App().TersCevir(liste ));
    }

    public void ElemanYok(){
        ArrayList<Integer> liste = new ArrayList<Integer>();
        assertEquals(null, new App().TersCevir(liste));
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
