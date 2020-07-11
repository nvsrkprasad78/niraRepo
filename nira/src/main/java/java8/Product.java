package java8;

interface SaySomething{
	void say(String s);
}

public enum Product implements SaySomething {

	Apple(70, "I am apple"), Samsung, Google(100, "I am google..");
	
	int price = 80;
	String say = "saying default..";
	
	Product(){
		System.out.println("default constructor..");
	}
	Product(int p, String s){
		price = p;
		say = s;
	}
	
	@Override
	public void say(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
}
