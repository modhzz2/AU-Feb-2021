import java.util.*;

class PrimeNoException extends Exception{  
    PrimeNoException(String s){  
        super(s);  
    }  
}  

public class three{  
      
	public static boolean checkPrime(int n) {
		if(n<=1)
			return false;
		if(n<=3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5; i*i<=n; i=i+6)
			if(n%i==0 || n%(i+2)==0)
				return false;
		return true;
	}
       
	static void helper(int i)throws PrimeNoException{  
        if(checkPrime(i))  
            throw new PrimeNoException("prime number detected");   
    }  
         
    public static void main(String args[]){  
        for(int i=1; i<=100; i++) {
        	try{  
        		helper(i);  
        	}
        	catch(Exception m){System.out.println("Exception occured: "+m);}  
        }  
    }

}

	