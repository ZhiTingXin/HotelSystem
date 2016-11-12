package data.service;

import PO.SystemStaffPO;

public interface SystemStaffDataService {

	public SystemStaffPO getSystemStaffPO(String user_id);

	public boolean modifySystemStaffPO(SystemStaffPO systemStaffPO);
}
