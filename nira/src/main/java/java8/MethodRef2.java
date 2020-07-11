package java8;

interface myinter{
	default void myDefaultMe() {

		System.out.println("from default..");
	}
	static void mystaticMe() {
		System.out.println("from static method...interface..");
	}
	String say();
}

interface constructorRefint{
	void conRf();
}

class injectableClass{
	String toSay;
	injectableClass(){
		this.toSay = "to say from injectable..";
		System.out.println("referring from injectable class..");
	}
}

public class MethodRef2 {

	public MethodRef2() {
		// TODO Auto-generated constructor stub
	}

	public static void iWannaSay() {
		System.out.println("RK is saying something..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//myinter inter = MethodRef2:: iWannaSay;
		
		//inter.say();
		
		myinter inter =  new myinter() {

			@Override
			public String say() {
				// TODO Auto-generated method stub 
				System.out.println("syning..");
				return "syaing";
			}
		};
		
		inter = () -> {
			System.out.println("from lambda..");
			return "from labda.";
		};
		
		
		String s = inter.say();
		inter.myDefaultMe();
		System.out.println(s);
		myinter.mystaticMe();
		constructorRefint conRef = injectableClass::new;
		conRef.conRf();
		//inter = injectableClass::new;
	}

}
