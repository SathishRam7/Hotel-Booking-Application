package org.ram.hotel.service;

import java.util.List;

import org.ram.hotel.model.Role;
import org.ram.hotel.model.User;

/**
 * @author Ram
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
