package hello1;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="address")
public class Address {
	
	@Id
	private String addressId;
	private String address;
	private String city;
	private String state;
	
	public Address(){}
	
	@PersistenceConstructor
	public Address( String address, String city, String state) {
		super();
		
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	

}
