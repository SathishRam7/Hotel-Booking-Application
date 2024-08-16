package org.ram.hotel.exception;

/**
 * @author Ram
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
