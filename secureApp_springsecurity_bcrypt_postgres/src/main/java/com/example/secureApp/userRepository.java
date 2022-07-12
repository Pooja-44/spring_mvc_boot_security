package com.example.secureApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Person,Long> {
Person findByUsername(String username);

}
