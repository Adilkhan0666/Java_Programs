import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
public static void main(String[] args) {
	Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
	Matcher m=p.matcher("578787878");
	if(m.find()) {
		System.out.println("found");
	}else {
		System.out.println("not found");
	}
	
	(Pattern.compile("[a-z]")).matcher("abc");
}
}
