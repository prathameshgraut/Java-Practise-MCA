package CommandLine_Java;

public class CommandLine {
public static void main(String[] args) {
	if(args.length>0) {
		System.out.println("Command Line Arguments :");
		
		for(int i=0;i<args.length;i++) {
			System.out.println("Argument"+(i+1)+":"+args[i]);
		}
	}else {
		System.out.println("No Command Line Arguments");
	}
}
}
