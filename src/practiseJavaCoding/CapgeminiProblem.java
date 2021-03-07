package practiseJavaCoding;

public class CapgeminiProblem {

	public static void main(String[] args) {
		
		String str = "Ind12ia45 ";
		// output Indiamy1245
		String suffixvalue = "my1245";
		String value = str.replaceAll("[0-9]", "");// to remove numbers using regexpression
		String oldvalue = value.concat(suffixvalue);// append 2 strings
		String updatedvalue = oldvalue.replaceAll("\\s", "");// remove spaces between words
		
		System.out.println(updatedvalue);
		
	}

}
