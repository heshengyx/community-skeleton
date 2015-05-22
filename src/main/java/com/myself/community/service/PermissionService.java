package com.myself.community.service;

import java.util.List;

import com.myself.community.entity.Permission;
import com.myself.community.page.Page;
import com.myself.community.param.PermissionQueryParam;

public interface PermissionService {

	int save(Permission param);
	int update(Permission param);
	int delete(Permission param);
	Permission getData(Permission param);
	
	List<Permission> list(PermissionQueryParam param);
	List<Permission> list(Page<PermissionQueryParam> param);
	List<Permission> queryPermissionsByRoleId(String roleId);
}
