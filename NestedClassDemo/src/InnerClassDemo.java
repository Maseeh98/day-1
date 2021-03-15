
public class InnerClassDemo {
	public static void main(String[] args) {
		Outerclass.InnerClass obj = new Outerclass.InnerClass();
		obj.display();
		Outerclass obj1= new Outerclass();
		Outerclass.InnerClassNonStatic  obj2 = obj1.new InnerClassNonStatic();
		obj2.display1();
	}

}
