package src.main.java;

class MyCustomException extends Exception
{
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomException{
    public static void main(String args[]) {
        try {
            int output = dividenum(10, 0);
        } catch (RuntimeException e) {
            MyCustomException mce = new MyCustomException("Custom Exception " + e.getMessage());
            System.out.println(mce.getMessage());
        }
    }
        public static  int dividenum(int dividend, int divisor){
        if(divisor==0){
            throw new RuntimeException("It is not possible");
        }
        return dividend/divisor;
    }
}