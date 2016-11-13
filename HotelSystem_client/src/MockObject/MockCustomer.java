package MockObject;

import java.util.Date;

import VO.CustomerVO;

public class MockCustomer extends CustomerVO{
	private String id;
	private String userName;
	private int credit;
	private Date birthday;
	private String companyName;	
	private int memberGrade;
	
	public MockCustomer(String id,String userName,int credit,int memberGrade){
		this.id = id;
		this.userName = userName;
		this.credit = credit;
		this.memberGrade = memberGrade;
	}
	public String getId(){
		return id;
	}
	public String getUserName(){
		return userName;
	}
	public Date getBirthday(){
		return birthday;
	}
}
