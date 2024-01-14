package org.centrale.medev_ds;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import
 
static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sacha
 */
    
public class PreparationDSTest {

    public PreparationDSTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of divideNumbers method, of class PreparationDS.
         * @throws java.lang.Exception
     */
    @Test
    public void testDivideNumbers() throws Exception {
        assertEquals(2.5F, PreparationDS.divideNumbers(10,4));
    }
}