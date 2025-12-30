//Print table of 9 but stop when product becomes more than 50.

public class Tableof9 {
  public static void main(String[] args) {
	for(int i = 1; i<=10; i++) {
		 
		if(9* i>50) {
			break;
		}
		System.out.println("9 x " + i + " = " + (9*i));
	}
}
}
