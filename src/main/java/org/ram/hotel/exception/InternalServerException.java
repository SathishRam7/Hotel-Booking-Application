package org.ram.hotel.exception;

/**
 * @author Ram
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
