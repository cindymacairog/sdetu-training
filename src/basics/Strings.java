package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Prison";
		bookTitle = "Prison Break";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word Prison "
					+ "(" + bookTitle + ")");
		}
		
		String movie = "Hachiko";
		if(movie.equalsIgnoreCase("hachiko")) {
			System.out.println("\n" + movie);
		}
		
		String fname = "Alexander";
		String lname = "Mahone";
		String SSN = "984537518";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		System.out.print(fname.substring(0,1));
		System.out.print(lname.substring(0,3));
		System.out.println(SSN.substring(5));
		

		
	}

}
