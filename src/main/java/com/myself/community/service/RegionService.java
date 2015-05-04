package com.myself.community.service;

import java.util.List;

import com.myself.community.entity.Region;
import com.myself.community.page.Page;
import com.myself.community.param.RegionQueryParam;

public interface RegionService {

	int save(Region param);
	int update(Region param);
	int delete(Region param);
	Region getData(Region param);
	List<Region> list(Page<RegionQueryParam> param);
}
