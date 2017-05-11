package com.hxd.beans;

public class Text {
	public Boolean yanzheng(User user){
		if ("admin".equals(user.getUserName())&&"admin".equals(user.getPassWord())) {
			return true;
		}else{
			return false;
		}
	}
}
