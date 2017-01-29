package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		for(int i=0;i<25;i++){
		Department department=new Department();
		department.setDepartmentName("Account");
		departmentRepository.save(department);
		
		
		Employee employee=new Employee("Ram","Thapa");
		List<Employee> employees=department.getEmployee();
		employees.add(employee);
		department.setEmployee(employees);
		
		employeeRepository.save(employee);
		departmentRepository.save(department);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
		Person personAchilles = new Person();
		
		personAchilles.setName("Achilles");
		personAchilles.setAge(50);
		personRepo.save(personAchilles);
		Person personHektor = new Person();
		
		personHektor.setName("Hektor");
		personHektor.setAge(60);
		
		Address address = new Address("221b Baker Street","London NW1","London");
		List<Address> addresses = personHektor.getAddresses();
		addresses.add(address);
		personAchilles.setAddresses(addresses);				
		
		addressRepo.save(address);
		personRepo.save(personHektor);
		
		//Iterable<Person> personList = personRepo.findAll();
		System.out.println("Person List : ");
		for (Person person : personRepo.findAll())
{
        System.out.println(person);
}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*departmentRepository.deleteAll();
		
		departmentRepository.save(new Department("Account"));
		departmentRepository.save(new Department("Administration"));
		departmentRepository.save(new Department("Library"));
		departmentRepository.save(new Department("Technical"));
		
		
		employeeRepository.deleteAll();
		
		for(int i=0;i<25;i++){
		employeeRepository.save(new Employee("Ram","Thapa","Account"));
		}
		
		for(Employee e : employeeRepository.findAll())
		{
			System.out.println(e);
			
		}
		
		*/
		
		
		
		
		
		
		
		
		
		/*repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
*/
	}

}
