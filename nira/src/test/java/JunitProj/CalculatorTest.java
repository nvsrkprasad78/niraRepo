package JunitProj;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {

	Calculator calc = null;
	
	@BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
        calc = new Calculator();
    }
     
    @Tag("DEV")
    @DisplayName("Repeated test")
    @RepeatedTest(value = 3)
    void testCalcOne() 
    {
        System.out.println("======TEST ONE EXECUTED=======");
        assertEquals( 4 , calc.add(2, 2));
    }
     
    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");
        assertEquals( 6 , calc.add(2, 4));
    }
    
    @Test
    void divideTest() {
    	//assertThrows(ArithemeticException, executable)
    }
    
    @Test
    @DisplayName("Asssert all test casess..")
    @EnabledOnOs(OS.WINDOWS)
    void assertAllTest() {
    	assertAll( // static imports, we can use the static methods without using class name.. java 1.5 feature.
    			() -> assertEquals(3, calc.add(1, 2)),
    			() -> assertEquals(5, calc.add(3, 2)),
    			() -> assertEquals(7, calc.add(5, 2))
    			
    			);
    }
  
    
    @Test
    void assumeTest() {
    	assumeTrue("if suerver is up..", true);
    	// then only the following test will run
    	
    }
    
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
