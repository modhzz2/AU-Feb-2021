import java.io.*;
import java.util.*;

class example implements Serializable {
    private static final long serialVersionUID = 1L;
	transient int a, b, c;
    int d, e;
	 
	public example(int a, int b, int c, int d, int e)
	{
	    this.a = a;
		this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
	}
}

 public class four{
     static void helper(example e){
         System.out.println("Value of a:"+e.a);
         System.out.println("Value of b:"+e.b);
         System.out.println("Value of c:"+e.c);
         System.out.println("Value of d:"+e.d);
         System.out.println("Value of e:"+e.e);
         System.out.println();
     } 
	public static void main(String []args){
		example e = new example(23, 42, 123, 43, 87);
		try {
			FileOutputStream file = new FileOutputStream("example_file.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(e);
			out.close();
			file.close();
			System.out.println("Data before deserialization:\n ");
            helper(e);
		}
		 catch (Exception e) {
			 System.out.println("Exception Caught");
		 }
		 e = null;
		 try {
			 System.out.println("\nDeserializing\n");
			 FileInputStream file = new FileInputStream("dataFile.txt");
			 ObjectInputStream in = new ObjectInputStream(file);
			 e = (example) in.readObject();
			 in.close();
			 file.close();
			 System.out.println("\n\nData after deserialization:\n ");
			 display(e);
		 }
		 catch (Exception e) { 
			 System.out.println("Exception Caught");
		 }
	 }
	 
 }


