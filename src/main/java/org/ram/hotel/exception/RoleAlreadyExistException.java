package org.ram.hotel.exception;

/**
 * @author Ram
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
