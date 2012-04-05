/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package certicamara;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Jhon
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class Calculator.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("Add");
        String numbers = "//[%][*]\n1001*2";
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.Add(numbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sumar method, of class Calculator.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        String numbers = "6;5;3000;1";
        List<Integer> negativos = new ArrayList<>();
        String split = ";";
        Calculator instance = new Calculator();
        int expResult = 12;
        int result = instance.sumar(numbers, negativos, split);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }

    /**
     * Test of delimitadores method, of class Calculator.
     */
    @Test
    public void testDelimitadores() {
        System.out.println("delimitadores");
        String numbers = "[=][*]";
        Calculator instance = new Calculator();
        List expResult = new ArrayList<>();
        expResult.add("=");
         expResult.add("*");
        List result = instance.delimitadores(numbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
