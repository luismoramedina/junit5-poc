package org;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

/**
 * @author luismoramedina
 */
public class ThisIsAClassTest {

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("ThisIsAClassTest.setUp");
    }



    @Test
    @DisplayName("Test que mola mogollon")
    public void testGiveMeFive() throws Exception {
        String five = new ThisIsAClass().getFive();
        assertEquals("five", five);

    }

    @Test
    @DisplayName("Test que mola 2")
    public void testGiveMeTwo() throws Exception {
        String five = new ThisIsAClass().getFive();
        assertEquals("five", five);

    }
}