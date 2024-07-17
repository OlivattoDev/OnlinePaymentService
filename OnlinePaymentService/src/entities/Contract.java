package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer numberOfContract;
	private LocalDate dateOfContract;
	private Double TotalValueOfContract;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}
	
	public Contract(Integer numberOfContract, LocalDate dateOfContract, Double totalValueOfContract) {
		this.numberOfContract = numberOfContract;
		this.dateOfContract = dateOfContract;
		TotalValueOfContract = totalValueOfContract;
	}

	public Integer getNumberOfContract() {
		return numberOfContract;
	}

	public LocalDate getDateOfContract() {
		return dateOfContract;
	}

	public void setDateOfContract(LocalDate dateOfContract) {
		this.dateOfContract = dateOfContract;
	}

	public Double getTotalValueOfContract() {
		return TotalValueOfContract;
	}

	public void setTotalValueOfContract(Double totalValueOfContract) {
		TotalValueOfContract = totalValueOfContract;
	}
	
	public List<Installment> getInstallments() {
		return installments;
	}
}