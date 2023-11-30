package com.axioma.backendpaymentapi.repository;

import com.axioma.backendpaymentapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //busca el usuario por el documento.
    Optional<User> findUserByDocument(String document);

    //busca el usuario por el ID
    Optional<User> findUserById(Long id);
}