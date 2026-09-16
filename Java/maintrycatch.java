package demo2;

public class maintrycatch {
    public static void main(String[] args) {
        int i=10;
        int c;
        try{
            c=i/0;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block");
        }
    }
    
}