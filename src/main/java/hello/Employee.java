package hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {
	
	@Id
	public String id;
	public String firstName;
	public String lastName;
	public String departmentName;
	
	
	@PersistenceConstructor
	public Employee(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		
		
	}
	public Employee(){}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", departmentName="
				+ departmentName + "]";
	}
	
	

}
