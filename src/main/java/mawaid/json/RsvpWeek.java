package mawaid.json;

import java.util.List;

public class RsvpWeek {

	private Long weekId;
	private String weekDesc;

	private List<RsvpDay> days;
	
	public RsvpWeek() {
		
	}

	public RsvpWeek(Long weekId, String weekDesc, List<RsvpDay> days) {
		this.weekId = weekId;
		this.weekDesc = weekDesc;
		this.days = days;
	}
	
	//-------------------------------------------
	public Long getWeekId() {
		return weekId;
	}

	public void setWeekId(Long weekId) {
		this.weekId = weekId;
	}

	public List<RsvpDay> getDays() {
		return days;
	}

	public void setDays(List<RsvpDay> days) {
		this.days = days;
	}

	public String getWeekDesc() {
		return weekDesc;
	}

	public void setWeekDesc(String weekDesc) {
		this.weekDesc = weekDesc;
	}

}
