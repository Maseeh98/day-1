
public class Outerclass {

	static int a = 5;
	int b = 10;
	private static int c = 15;
	
	static class InnerClass{
		void display() {
			System.out.println("Outer static int =" + a);
			//System.out.println("Outer static int ="+ b);
			System.out.println("Outer private int =" + c);
			
		}
	}
	
	class InnerClassNonStatic{
		void display1() {
			System.out.println("Outer static int =" + a);
			System.out.println("Outer static int ="+ b);
			System.out.println("Outer private int =" + c);
		}
	}
	
	
}
