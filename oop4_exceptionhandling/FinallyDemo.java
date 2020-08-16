package oop4_exceptionhandling;

/**
 * In this example, procA( ) prematurely breaks out of the try by throwing an exception.
The finally clause is executed on the way out. procB( )’s try statement is exited via a return
statement. The finally clause is executed before procB( ) returns. In procC( ), the try
statement executes normally, without error. However, the finally block is still executed.
 * @author Safdar.Khan
 *
 */
//demonstrate finally.
public class FinallyDemo {

	//throw an exception out of the method.
	static void procA(){
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("procA's finally");
		}
	}
	
	//return from within a try block.
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		} finally {
			System.out.println("procB's finally");
		}
	}
	
	//execute a try block normally
	static void procC() {
		try {
			System.out.println("inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}
	
	public static void main(String[] args) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("exception caught");
		}
		
		procB();
		procC();
	}

}
