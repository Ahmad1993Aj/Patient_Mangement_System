package com.codewithahmad.fullstackbackend.repository;

import com.codewithahmad.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
