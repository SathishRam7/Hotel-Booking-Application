package org.ram.hotel.exception;

/**
 * @author  Ram
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
