package com.myself.community.service;

import java.util.List;

import com.myself.community.entity.Permission;

public interface PermissionService {

	List<Permission> queryPermissionsByRoleId(String roleId);
}
