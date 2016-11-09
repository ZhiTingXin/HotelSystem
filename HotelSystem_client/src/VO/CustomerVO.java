package VO;

import java.util.Date;

import PO.CustomerPO;

public class CustomerVO {
	
	private String id;

	private String userName;

	private int credit;

	private Date birthday;

	private String companyName;
	
	private int memberGrade;

	private enum memberState {
		BUSINESS_MEMBER, NORMAL_MEMBER, NON_MEMBER;
	}

	public CustomerVO() {
		super();
	}

	public CustomerVO(CustomerPO userPO) {
		super();
		this.id = userPO.getId();
		this.userName = userPO.getUserName();
		this.credit = userPO.getCredit();
		this.birthday = userPO.getBirthday();
		this.memberGrade = userPO.getMemberGrade();
	}

	public CustomerVO(String id,String userName,int credit) {
	
		this.id = id;
		this.userName = userName;
		this.credit = credit;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(int memberGrade) {
		this.memberGrade = memberGrade;
	}

}
