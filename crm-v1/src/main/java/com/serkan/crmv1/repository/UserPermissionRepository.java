package com.serkan.crmv1.repository;

import com.serkan.crmv1.model.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermission,String> {
}
