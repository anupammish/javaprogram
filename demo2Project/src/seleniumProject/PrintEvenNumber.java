package seleniumProject;

public class PrintEvenNumber {

	public static void main(String[] args) {
		int numb = 100;
		for (int i = 1; i <= numb; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
