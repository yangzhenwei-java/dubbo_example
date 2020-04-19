package com.study.event;

import com.study.dto.UserDTO;

public interface UserNotify {
	
	/**
	 * 
	 * @param dto 返回值
	 * @param id  传入参数
	 */
	void onreturn(UserDTO dto, Integer id);
	
	/**
	 * 
	 * @param ex  异常信息
	 * @param id  传入参数
	 */
     void onthrow(Throwable ex,  Integer id);
}
