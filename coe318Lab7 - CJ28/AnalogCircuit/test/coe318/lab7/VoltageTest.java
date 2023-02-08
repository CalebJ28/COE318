/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author my_mc
 */
public class VoltageTest {
    
    public VoltageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of class Voltage.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Node nodeC = new Node();
        Node nodeD = new Node();
        Voltage instance = new Voltage(1.0, nodeC, nodeD);
        Node[] expResult = {nodeC, nodeD};
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVoltage method, of class Voltage.
     */
    /*@Test
    public void testGetVoltage() {
        System.out.println("getVoltage");
        Voltage instance = null;
        double expResult = 0.0;
        double result = instance.getVoltage();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Voltage.
     */
    /*@Test
    public void testGetID() {
        System.out.println("getID");
        Voltage instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Voltage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Node nodeA = new Node();
        Node nodeB = new Node();
        Voltage instance = new Voltage(2.0, nodeA, nodeB);
        String expResult = " V2 2 3 DC 2.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
