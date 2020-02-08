package com.cachetian.ums.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.cachetian.ums.persistence.core.CtPersistenceObject;

/**
 * @author cachetian
 *
 */
@Entity
@Table(name = "tb_user_role")
@NamedQueries({
	@NamedQuery(name = "UserRole.getRolesByUserId", query = "SELECT ur FROM CtEntityUserRoleAssociation ur where ur.userId = :userId"),
})
public class CtEntityUserRoleAssociation extends CtPersistenceObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long userId;
	private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "CtEntityUserRoleAssociation [userId=" + userId + ", roleId=" + roleId + "]";
	}
}