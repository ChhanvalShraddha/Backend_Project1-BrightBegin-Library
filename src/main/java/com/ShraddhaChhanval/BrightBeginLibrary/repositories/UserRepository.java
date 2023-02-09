package com.ShraddhaChhanval.BrightBeginLibrary.repositories;

import com.ShraddhaChhanval.BrightBeginLibrary.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String name);

    // update password function
}