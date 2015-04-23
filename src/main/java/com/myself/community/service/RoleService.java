package com.myself.community.service;

import java.util.List;

import com.myself.community.entity.Role;

public interface RoleService {

	List<Role> queryRolesByUserId(String userId);
}
