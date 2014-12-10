package mawaid.json;

public class RsvpDay {

	private Long dayId;
	private String dayDesc;
	private String dayType; // None, Mawaid, Miqaat
	private String menu;
	private Integer smallCount;
	private Integer largeCount;
	private String location;
	private Boolean isLocked;
	private Boolean isPast;

	//---------------------------------------------
	public Long getDayId() {
		return dayId;
	}

	public void setDayId(Long dayId) {
		this.dayId = dayId;
	}

	public String getDayDesc() {
		return dayDesc;
	}

	public void setDayDesc(String dayDesc) {
		this.dayDesc = dayDesc;
	}

	public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Integer getSmallCount() {
		return smallCount;
	}

	public void setSmallCount(Integer smallCount) {
		this.smallCount = smallCount;
	}

	public Integer getLargeCount() {
		return largeCount;
	}

	public void setLargeCount(Integer largeCount) {
		this.largeCount = largeCount;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Boolean getIsPast() {
		return isPast;
	}

	public void setIsPast(Boolean isPast) {
		this.isPast = isPast;
	}

}
