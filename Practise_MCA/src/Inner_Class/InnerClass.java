package Inner_Class;

public class InnerClass {
	public void print() {
		System.out.println("Outer Class Method");
		
		 class INClass{
			public void print1() {
				System.out.println("This is Inner Class Print");
			}
		}
		INClass IN = new INClass();
		IN.print1();
	}
	public static void main(String[] args) {
		InnerClass i = new InnerClass();
		i.print();
	}
}
