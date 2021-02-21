// American flag

public class Flag {
    public static void main(String[] args) {
        int l=30, h=30;
        
        for(int i=0; i<h; i++){
            if(i<h/2){
                if(i%2==0){
                    for(int j=0; j<l/3; j++){
                        System.out.print("*");
                        System.out.print(" ");
                    }
                }
                else{
                    for(int j=0; j<l/3; j++){
                        System.out.print(" ");
                        System.out.print("*");
                    }
                }
                for(int j=l/3; j<l; j++)
                    System.out.print("_");
            }
            else{
                for(int j=0; j<l+l/3; j++)
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}