package VO;

import java.util.Date;

/**��վӪ�����Ե�����
 * ��վӪ�����Ե�����
 * �ƶ���վӪ�����Ե���վӪ����Ա��id
 * ��վӪ�����Ե�����ʱ��
 * ��վӪ���������õľƵ�
 * ��վӪ�����Ե�������Ȧ
 * @author zhiting Xin
 *
 */
public class SystemStrategyVO {
	
     private String systemStrategy_name;
     private String systemStrtegy_content;
     private Date begin_date;
     private Date end_date;

	 private String bussinessDistrict;
     private String systemStaffID;
     
     public SystemStrategyVO(String systemstrategy_name,String systemstrategy_content,Date begin,Date end,
    		 String bussinessdistrict,String hotelid,String systemstaffID){
    	 this.systemStrategy_name=systemstrategy_name;
    	 this.systemStrtegy_content=systemstrategy_content;
    	 this.begin_date = begin;
    	 this.end_date = end;
    	 this.bussinessDistrict = bussinessdistrict;
    	 this.hotelID = hotelid;
    	 this.systemStaffID = systemstaffID;
     }
     
     public SystemStrategyVO(SystemStrategyPO systemstrategypo,SystemStaffPO systemstaffpo){
    	 this.systemStrategy_name = systemstrategypo.getName();
    	 this.systemStrtegy_content = systemstrategypo.getContent();
    	 this.begin_date = systemstrategypo.getBegin_date();
    	 this.end_date = systemstrategypo.getEnd_date();
    	 this.bussinessDistrict = systemstrategypo.getBussinessDistrict();
    	 this.systemStaffID = systemstaffpo.getID();
     }
     
     public String getStrategy_name(){
    	 return this.systemStrategy_name;
     }
     
     public String getSystemStrategy_content(){
    	 return this.systemStrtegy_content;
     }
     
     public Date getBegin_Date(){
    	 return this.begin_date;
     }
     
     public String getSystemStaffID() {
 		return this.systemStaffID;
 	}
     
     public Date getEnd_date() {
 		return end_date;
 	}
}
