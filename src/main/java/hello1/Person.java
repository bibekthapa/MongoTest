package hello1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Person")
public class Person {
	
	@Id
	private String personId;
	private String name;
	private int age;
	
	@DBRef(db="address")
	private List<Address> addresses=new ArrayList<>();
	
	public Person(){}
	
	@PersistenceConstructor
	public Person(String name, int age)
	{
		
		this.name=name;
		this.age=age;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", addresses=" + addresses + "]";
	}
	
	
	

}
