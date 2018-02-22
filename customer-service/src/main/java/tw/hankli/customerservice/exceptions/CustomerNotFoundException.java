package tw.hankli.customerservice.exceptions;

public class CustomerNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(String pesel) {
        super("No such customer: " + pesel);
    }

}
