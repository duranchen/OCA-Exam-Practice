package q19;

public class Main {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		
		int d = false?a:(b<c)?b:c;
		
		System.out.println(d);

	}

}
