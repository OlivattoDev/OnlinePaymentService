package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class PaymentProgram {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter datas of contract: ");
		System.out.print("Number of contract: ");
		int contractNumber = sc.nextInt();
		System.out.print("Date of contract (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(), dtf);
		System.out.print("Value of contract: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, contractDate, contractValue);
		
		System.out.print("Enter the number of installments: ");
		int contractInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, contractInstallments);
		
		System.out.println("Installments: ");
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}