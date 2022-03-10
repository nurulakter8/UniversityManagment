
public class Student implements SerializabletoXML {
	private String name;
	private String houseNo;
	private String homeStreet;
	private String homeCity;
	private String homeZip;
	private String homeState;

	public Student(String name, String houseNo, String homeStreet, String homeCity, String homeZip, String homeState) {
		this.name = name;
		this.houseNo = houseNo;
		this.homeStreet = homeStreet;
		this.homeCity = homeCity;
		this.homeZip = homeZip;
		this.homeState = homeState;
	}

	public void study() {

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

	public boolean isTaking(Course course) {
		return course.getStudents().contains(this);
	}

	public String toXML() {
		return "<Student><Name>" + name + "</Name></Student>";
	}
}
