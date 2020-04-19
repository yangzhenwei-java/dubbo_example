package cn.creditease.event;

import cn.creditease.dto.UserDTO;

public class UserNotifyImpl implements UserNotify{
	
	public void onreturn(UserDTO dto, Integer id) {
		System.err.println("事件通知返回结束.传入参数:"+id+";结果返回："+dto);
		
	}
	
	public void onthrow(Throwable ex, Integer id) {
		
		System.err.println("事件通知异常了,传入参数："+id+";异常信息："+ex.getMessage());
	}

}
