package be.thomas.sandwichspring.exception;

public class EmailAlreadyTakenException extends RuntimeException {

    public EmailAlreadyTakenException() {
        super("the specified email is already taken");
    }
}
