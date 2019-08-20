package oca.inheritance.with_exceptions;

class WeekdayException extends Exception {

}

class TuesdayException extends WeekdayException {

}

interface WeekDay {
    void study() throws WeekdayException;
}

class Monday implements WeekDay {

    @Override
    public void study() throws WeekdayException {

    }
}

class Tuesday implements WeekDay {

    @Override
    public void study() throws TuesdayException { // can't throw Exception here

    }
}


public class AboutInterfaceWithExceptions {

    public static void main(String[] args) {
        Monday monday = new Monday();
        Tuesday tuesday = new Tuesday();
        // tuesday.study();
        // monday.study();
    }

}
