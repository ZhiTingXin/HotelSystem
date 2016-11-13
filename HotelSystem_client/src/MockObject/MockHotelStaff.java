package MockObject;

import VO.HotelStaffVO;

public class MockHotelStaff extends HotelStaffVO {

	private String id;
	private String userName;
	private String hotelName;

	public MockHotelStaff(String id, String username, String hotelname) {
		this.id = id;
		this.userName = username;
		this.hotelName = hotelname;
	}

	public String getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}
}
