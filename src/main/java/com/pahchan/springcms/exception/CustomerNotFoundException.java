package com.pahchan.springcms.exception;


public class CustomerNotFoundException  extends RuntimeException{

    public CustomerNotFoundException(String message) {
        super(message);
    }

}
