package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="company")
public class Company {
	
	@Id
	private String id;
	private String companyName;
	
	@DBRef
	private List<Department> departments=new ArrayList<>();
	
	@PersistenceConstructor
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}
	public Company(){}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", departments=" + departments + "]";
	}
	
	
	
	
	
	

}
