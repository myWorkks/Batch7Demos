package com.marolix.Collections;

public class Employee implements Comparable<Employee> {
	private Integer empId;
	private String empName;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee() {
		super();

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee o) {
		Integer eId1 = this.empId;// 1000
		Integer eId2 = o.empId;// 1000
		if (eId1 > eId2)
			return 89;
		else if (eId1.equals(eId2))
			return 0;
		else
			return -1;
		// return eId1.compareTo(eId2);
	}

}
