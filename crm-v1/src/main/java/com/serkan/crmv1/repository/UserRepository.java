package com.serkan.crmv1.repository;

import com.serkan.crmv1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,String> {
}
