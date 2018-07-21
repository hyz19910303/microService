package com.neusoft.microservice.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
*Create at 2018年7月21日 下午6:04:28
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName microservice-inerfance
*
*Description: 
*        
*/

@Data
@Accessors(chain=true)
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String userName;
	
	private String createTime;
	
	
}
