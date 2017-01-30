package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		companyRepository.deleteAll();
		departmentRepository.deleteAll();
		employeeRepository.deleteAll();
		
		Company company=new Company();
		company.setCompanyName("Ver");
		
		
		
		/*Department department = new Department();
		department.setDepartmentName("Account");
		departmentRepository.save(department);*/
		
		
			Department department=new Department("Account");
			List<Department> departments=company.getDepartments();
			departments.add(department);
			company.setDepartments(departments);
			departmentRepository.save(department);
			companyRepository.save(company);
			
			
			
			Department department2=new Department("Administration");
			List<Department> departmentss=company.getDepartments();
			departments.add(department2);
			company.setDepartments(departmentss);
			departmentRepository.save(department2);
			companyRepository.save(company);
			
			
			
			
			
		
		
		
		

		for (int i = 0; i < 4; i++) {
			
			
			

			Employee employee = new Employee("Ram", "Thapa");
			List<Employee> employees = department.getEmployee();
			employees.add(employee);
			department.setEmployee(employees);
			employeeRepository.save(employee);
			
		}
		
		departmentRepository.save(department);
		
		
		/*Department department = new Department();
		department1.setDepartmentName("Administration");
		departmentRepository.save(department1);
*/
		for (int i = 0; i < 4; i++) {
			
			
			

			Employee employee = new Employee("Jhalak", "Budathoki");
			List<Employee> employees = department2.getEmployee();
			employees.add(employee);
			department2.setEmployee(employees);
			employeeRepository.save(employee);
			
		}
		
		departmentRepository.save(department2);
		
		for(Department dp: departmentRepository.findAll())
		{
			System.out.println(dp);
			
			
		}

		/*
		 * Person personAchilles = new Person();
		 * 
		 * personAchilles.setName("Achilles"); personAchilles.setAge(50);
		 * personRepo.save(personAchilles); Person personHektor = new Person();
		 * 
		 * personHektor.setName("Hektor"); personHektor.setAge(60);
		 * 
		 * Address address = new
		 * Address("221b Baker Street","London NW1","London"); List<Address>
		 * addresses = personHektor.getAddresses(); addresses.add(address);
		 * personAchilles.setAddresses(addresses);
		 * 
		 * addressRepo.save(address); personRepo.save(personHektor);
		 * 
		 * //Iterable<Person> personList = personRepo.findAll();
		 * System.out.println("Person List : "); for (Person person :
		 * personRepo.findAll()) { System.out.println(person); }
		 * 
		 */

		/*
		 * departmentRepository.deleteAll();
		 * 
		 * departmentRepository.save(new Department("Account"));
		 * departmentRepository.save(new Department("Administration"));
		 * departmentRepository.save(new Department("Library"));
		 * departmentRepository.save(new Department("Technical"));
		 * 
		 * 
		 * employeeRepository.deleteAll();
		 * 
		 * for(int i=0;i<25;i++){ employeeRepository.save(new
		 * Employee("Ram","Thapa","Account")); }
		 * 
		 * for(Employee e : employeeRepository.findAll()) {
		 * System.out.println(e);
		 * 
		 * }
		 * 
		 */

		/*
		 * repository.deleteAll();
		 * 
		 * // save a couple of customers repository.save(new Customer("Alice",
		 * "Smith")); repository.save(new Customer("Bob", "Smith"));
		 * 
		 * // fetch all customers
		 * System.out.println("Customers found with findAll():");
		 * System.out.println("-------------------------------"); for (Customer
		 * customer : repository.findAll()) { System.out.println(customer); }
		 * System.out.println();
		 * 
		 * // fetch an individual customer
		 * System.out.println("Customer found with findByFirstName('Alice'):");
		 * System.out.println("--------------------------------");
		 * System.out.println(repository.findByFirstName("Alice"));
		 * 
		 * System.out.println("Customers found with findByLastName('Smith'):");
		 * System.out.println("--------------------------------"); for (Customer
		 * customer : repository.findByLastName("Smith")) {
		 * System.out.println(customer); }
		 */
	}

}
