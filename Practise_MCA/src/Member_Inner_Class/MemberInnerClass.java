package Member_Inner_Class;

public class MemberInnerClass {
	int num=10;
	
	class MIC{
		void print() {
			System.out.println("Member Inner Class");
			System.out.println("Num Of Outer Class: "+num);
		}
	}
	
	void display() {
		MIC m1 =new MIC();
		m1.print();
	}
	public static void main(String[] args) {
		MemberInnerClass mic= new MemberInnerClass();
		mic.display();
	}
}
