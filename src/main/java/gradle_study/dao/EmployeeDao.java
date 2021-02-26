package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Department;
import gradle_study.dto.Employee;


public interface EmployeeDao {
	List<Employee> selectEmployeeByall();
	Employee selectEmployeeByNo(Employee employee);
	List<Employee> selectEmployeeGroupByDept(Department department);
	
	
	int insertEmployee(Employee employee);
	int updateEmployee(Employee employee);
	int deleteEmployee(Employee employee);
}
