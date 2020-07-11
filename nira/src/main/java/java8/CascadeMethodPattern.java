package java8;

import java.util.function.Consumer;

class Mailer{
	String from;
	String to;
	public Mailer from(String from) {this.from = from; print(from); return this;}
	public Mailer to(String from) {this.to = from; print(to); return this;}
	public void print(String s) {System.out.println(s);}
	public static void send(Consumer<Mailer> block) {
		Mailer mailer = new Mailer(); 
		block.accept(mailer);
		System.out.println("sending..");
	}
}
public class CascadeMethodPattern {

	public CascadeMethodPattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mailer.send(mailer ->
		mailer.from("RK")
		.to("nvsrk")
		);
		
	}

}
