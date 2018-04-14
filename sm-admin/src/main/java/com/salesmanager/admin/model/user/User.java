package com.salesmanager.admin.model.user;

import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.admin.model.AbstractModel;

public class User extends AbstractModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
