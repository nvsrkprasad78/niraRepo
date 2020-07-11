package JunitProj;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest4Mockito {

	//@Mock
	CalculatorService service = mock(CalculatorService.class);
	
	//@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	Calculator cal = null;
	
	@BeforeAll
	static void init() {
		System.out.println("@BeforAll..");
	}
	  @BeforeEach
	    void setupThis(){
	        System.out.println("@BeforeEach executed");
	        cal = new Calculator(service);
	    }
	
	@Test
    void mockTest() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, cal.perform(2, 3));
		verify(service).add(2, 3);
	}


}
