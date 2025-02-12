//3_b Write a program to define user defined exceptions and raise them as per the requirements  
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class Userdefine_excep {
    public static void main(String args[]){
        int x=5;
        int y=1000;
        try{
            float z =(float)x/(float)y;
            if(z<0.01){
                throw new MyException("number is too small");
            }
        }
        catch(MyException e){
            System.out.println("Caugth my Exception");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I am always executed");
        }
    }
}