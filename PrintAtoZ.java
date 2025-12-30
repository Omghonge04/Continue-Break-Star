//Print characters from â€˜Aâ€™ to â€˜Zâ€™ but skip vowels.
public class PrintAtoZ {
	public static void main(String[] args) {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                continue;  
            }
            System.out.print(ch + " ");
        }

	}
		

}
