package com.jcoder.springsecurity.repository;

import com.jcoder.springsecurity.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

    Role findByRolename(String rolename);
}
