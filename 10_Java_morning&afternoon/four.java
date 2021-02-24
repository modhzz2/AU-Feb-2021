import java.io.*;
import java.util.*;

class example implements Serializable {
    private static final long serialVersionUID = 1L;
	transient int a1, a2, a3;
    int a4, a5;
	 
	public example(int a1, int a2, int a3, int a4, int a5)
	{
	    this.a1 = a1;
		this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
	}
}

 public class four{
     static void helper(example ex){
         System.out.println("Value of a1:"+ex.a1);
         System.out.println("Value of a2:"+ex.a2);
         System.out.println("Value of a3:"+ex.a3);
         System.out.println("Value of a4:"+ex.a4);
         System.out.println("Value of a5:"+ex.a5);
         System.out.println();
     } 
	public static void main(String []args){
		example ex = new example(23, 42, 123, 43, 87);
		try {
			FileOutputStream file = new FileOutputStream("example_file.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(ex);
			out.close();
			file.close();
			System.out.println("Data before deserialization:\n ");
            helper(ex);
		}
		 catch (Exception e) {
			 System.out.println("Serialization exception Caught");
		 }
		 ex = null;
		 try {
			 System.out.println("\nDeserializing\n");
			 FileInputStream file = new FileInputStream("example_file.txt");
			 ObjectInputStream in = new ObjectInputStream(file);
			 ex = (example) in.readObject();
			 in.close();
			 file.close();
			 System.out.println("\n\nData after deserialization:\n ");
			 helper(ex);
		}
		 catch (Exception e) { 
			 System.out.println("Deserialization Exception Caught");
		 }
	 }
	 
 }


