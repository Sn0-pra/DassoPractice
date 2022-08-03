package com.rutup.employeeDto;

import java.util.Objects;

public class EmployeeDTO {
	
	private String name;
	private Integer id;
	
	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", id=" + id + "]";
	}
	
	public EmployeeDTO(String name, Integer id){
		System.out.println("Application in EmployeeDTO");
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		EmployeeDTO other = (EmployeeDTO) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}

