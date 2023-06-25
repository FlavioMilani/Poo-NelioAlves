package br.com.fj.pooneliaalves.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fj.pooneliaalves.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department department;
	
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	};
	
	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double salary = baseSalary;
		Calendar calendar = Calendar.getInstance();
		for(HourContract contract : contracts) {
			calendar.setTime(contract.getDate());
			int contractYear = calendar.get(Calendar.YEAR);
			int contractMonth = 1 + calendar.get(Calendar.MONTH); // Mês do calendar começa em 0.
			
			if(contractYear == year && contractMonth == month ) {
				salary += contract.totalValue();
			}
			
/*			if(contract.getDate().getYear() == year && contract.getDate().getMonth() == month ) {
				salary += contract.totalValue();
			}
*/
		}
		return salary;
	}
}
