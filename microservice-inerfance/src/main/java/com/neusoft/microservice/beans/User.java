package com.neusoft.microservice.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Create at 2018年7月21日 下午6:04:28
 * 
 * @autuor EVIL
 *
 * @version 1.0
 *
 *          ProjectName microservice-inerfance
 *
 *          Description:
 * 
 */

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String accountno;
	private String name;
	private String email;
	private String phono;
	private String password;
	private String lockstatus;
	private String expiretime;
	private String forbidips;
	private String createtime;
	private String edittime;
	private String logintime;
	private String logincount;
	private String flag;
	private String org_id;

}
