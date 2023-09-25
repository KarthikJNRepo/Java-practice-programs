package OwnImmutableClass;

public class Address {
	int HouseNumber;
	String city;
	public int getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(Address addresss) {
		this(addresss.getHouseNumber(),addresss.getCity());
		
	}
	public Address(int houseNumber, String city) {
		super();
		HouseNumber = houseNumber;
		this.city = city;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [HouseNumber=" + HouseNumber + ", city=" + city + "]";
	}
	
	

}
