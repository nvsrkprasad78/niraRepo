package java8;

import java.util.function.Consumer;

class Resource {
	private Resource() {System.out.println("created..");}
	public Resource op1() {System.out.println("op1 called.."); return this;}
	public Resource op2() {System.out.println("op2 called.."); return this;}
	private void close() {System.out.println("clean up..");}
	
	public static void use(Consumer<Resource> block) {
		Resource res = new Resource();
		try {
			block.accept(res);
		}finally{
			res.close();
		}
	}
}

public class ExecuteAroundPattern {

	public ExecuteAroundPattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * java 7: try with resource..
		try(Resource res = new Resource()){
		res.op1();
		res.op2();
		}
		*/
		
		Resource.use(rs ->
		rs.op1()
		.op2());
	}

}
