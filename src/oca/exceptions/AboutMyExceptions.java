package oca.exceptions;


class MyException extends Exception {

    public MyException(String errorMessage) {
        super(errorMessage);
    }

}

class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(String errorMessage) {
        super(errorMessage);
    }

}


public class AboutMyExceptions {

    public void theMethodThrowsMyException() {
        throw new MyRuntimeException("This is an error");
    }

    public void useMethod() {
            theMethodThrowsMyException();
    }

    public static void main(String[] args) {


    }

}
