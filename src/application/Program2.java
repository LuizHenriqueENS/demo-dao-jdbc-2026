package application;

import java.util.List;

import db.DB;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = new DepartmentDaoJDBC(DB.getConnection());

		System.out.println("\n=== Test 1 - findById ===");
		Department dep = departmentDao.findyById(2);
		System.out.println(dep);

		System.out.println("\n=== Test 2 - insert ===");
		Department newDepartment = new Department();
		newDepartment.setName("Tools");
		departmentDao.insert(newDepartment);

		System.out.println("\n=== Test 3 - deleteById ===");
		departmentDao.deleteById(13);

		System.out.println("\n=== Test 4 - findAll ===");
		List<Department> list = departmentDao.findAll();

		for (Department obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== Test 5 - findByName ===");
		dep = departmentDao.findByName("Book");
		if (dep != null) {
			System.out.println(dep);
		}
		
		DB.closeConnection();

	}

}
