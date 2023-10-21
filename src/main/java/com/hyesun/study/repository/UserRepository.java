package com.hyesun.study.repository;


import com.hyesun.study.entity.Account;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Account, Long> {
   @EntityGraph(attributePaths = "authorities")
   Optional<Account> findOneWithAuthoritiesByUsername(String username);
}
