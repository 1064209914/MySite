package servlet;

import java.io.Serializable;

public class User implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	String userName;
	String passWord;

	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return  userName + "="+ passWord ;
	}

}
