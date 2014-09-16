package singleton;

public class PrintSpool {
	private static PrintSpool singleton = new PrintSpool();
	
	private PrintSpool() {
		
	}
	
	public static PrintSpool getInstance(){
		return singleton;
	}
	
	public void print(String str){
		System.out.println("Print : "+str);
	}
}
