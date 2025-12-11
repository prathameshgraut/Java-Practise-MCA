package UserDefine_Exception;

public class Test {
public static void main(String[] args) {
	try {
		int num=10;
		int all=10/0;
		throw new Demo("User Define Exception");
	} 
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
