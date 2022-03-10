
public class Staff {
	private String name;
	private String houseNo;
	private String homeStreet;
	private String homeCity;
	private String homeZip;
	private String homeState;

	public Staff(String name, String houseNo, String homeStreet, String homeCity, String homeZip, String homeState) {
		this.name = name;
		this.houseNo = houseNo;
		this.homeStreet = homeStreet;
		this.homeCity = homeCity;
		this.homeZip = homeZip;
		this.homeState = homeState;
	}

	public void assist() {
		
	}

	public String getHomeState() {
		return homeState;
	}

	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}

	public String getHomeZip() {
		return homeZip;
	}

	public void setHomeZip(String homeZip) {
		this.homeZip = homeZip;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public String getHomeStreet() {
		return homeStreet;
	}

	public void setHomeStreet(String homeStreet) {
		this.homeStreet = homeStreet;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
