package JunitProj;

public class Calculator {

	CalculatorService service;
	public Calculator() {}
	
	public Calculator(CalculatorService service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}

	public int add(int a, int b) {
		return a + b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public int perform(int i, int j) {
		return service.add(i, j)*i;
		//return (i+j)*i;
	}
	
}
