//3_a Write a program to raise built-in exceptions and raise them as per the requirements 
public class Bulitin_Example {
    public static void main(String args[]){
        int invalid = 0;
        int number,count=0;
        for(int i=0;i<args.length;i++){
            try{
                number=Integer.parseInt(args[i]);
            }catch(NumberFormatException e){
                invalid = invalid+1;
                System.out.println("Invalid number = "+args[i]);
                continue;
            }
            count=count+1;
        }
        System.out.println("valid number = "+count);
        System.out.println("invalid number = "+invalid);
    }
}
