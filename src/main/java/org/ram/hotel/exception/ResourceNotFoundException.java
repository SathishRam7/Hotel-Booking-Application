package org.ram.hotel.exception;

/**
 * @author  Ram
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
