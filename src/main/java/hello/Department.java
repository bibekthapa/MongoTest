package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="department")
public class Department {
	
	@Id
	public String id;
	public String departmentName;
	
	@DBRef
	private List<Employee> employee=new ArrayList<>(); 
	
	
	@PersistenceConstructor
	public Department(String departmentName)
	{
			this.departmentName=departmentName;
		
	}
	
	
	
	

	public Department() {
		// TODO Auto-generated constructor stub
	}





	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

	public List<Employee> getEmployee() {
		return employee;
	}





	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}





	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
	

}
