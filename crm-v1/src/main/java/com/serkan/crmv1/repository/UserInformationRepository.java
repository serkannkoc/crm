package com.serkan.crmv1.repository;

import com.serkan.crmv1.model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationRepository extends JpaRepository<UserInformation,String> {
}
