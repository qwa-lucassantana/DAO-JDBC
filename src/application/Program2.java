package application;

import model.dao.DepartmentDao;
import model.dao.impl.DaoFactory;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1 Department Find By ID ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println();

        System.out.println("=== TEST 2 Department Insert ===");
        Department newDepartment = new Department(null, "Developers");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println();

        System.out.println("=== TEST 3 Department Update ===");
        department = departmentDao.findById(1);
        department.setName("DevHub");
        departmentDao.update(department);
        System.out.println("Update Completed!");

        System.out.println();

        System.out.println("=== TEST 4 Find All ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list){
            System.out.println(dep);
        }

        System.out.println();

        System.out.println("=== TEST 5 Department Delete ===");
        System.out.print("Enter id for delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed! ");

    }
}
