package java8;

interface Addable{
	int add(int a, int b);
}

class AddImpl{
	
	public static int addTen(int a, int b) {
		return a + b + 10;
	}
	
	public int addTwenty(int a, int b) {
		return a + b + 20;
	}
}

public class LambdaEx {

	public LambdaEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable add1 = (a, b) -> {
			return a+b;
		};
		
		System.out.println("labmda1 :: " + add1.add(4, 5));
		
		add1 = (a, b) -> (a + b);

		System.out.println("labmda2 :: " + add1.add(4, 5));
		
		add1 = AddImpl::addTen;		

		System.out.println("MR1 :: " + add1.add(4, 5));
		
				
		
	}

}
