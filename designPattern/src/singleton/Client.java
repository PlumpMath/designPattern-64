package singleton;

public class Client {
	public static void main(String[] args) {
		PrintSpool a = PrintSpool.getInstance();
		a.print("aaa");
		PrintSpool b = PrintSpool.getInstance();
		b.print("bbb");
	}
}
