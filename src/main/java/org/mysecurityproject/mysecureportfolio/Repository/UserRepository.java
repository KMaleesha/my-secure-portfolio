package org.mysecurityproject.mysecureportfolio.Repository;

import jdk.jfr.Registered;
import org.mysecurityproject.mysecureportfolio.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);
}
