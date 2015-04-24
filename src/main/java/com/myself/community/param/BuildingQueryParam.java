package com.myself.community.param;

import java.io.Serializable;
import java.util.Date;

public class BuildingQueryParam implements Serializable {

	private String buildingName;
	private String status;
	private Date createTime;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
}
