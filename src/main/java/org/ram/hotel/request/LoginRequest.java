package org.ram.hotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Ram
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
