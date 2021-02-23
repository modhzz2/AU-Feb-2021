import java.util.regex.*;

class one {
  public static void main(String[] args) {
   
      String input="abbaaabbab", source="a[ba]{3}a", target="xxx";

	  Pattern p = Pattern.compile(source, Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(input);

      String output=input;
      if(m.find())
        output=input.replaceAll(source, target);
	  
      System.out.println(output);
  }
}
