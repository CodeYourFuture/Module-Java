package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Contract oneYearContract = new Contract("John Smith", "25", LocalDate.of(2025, 8, 12), 10000, Contract.ContractLengthYears.One_YEAR);
        Contract twoYearContract = new Contract("Michael Jones", "56", LocalDate.of(2025, 12, 12), 20000, Contract.ContractLengthYears.THREE_YEARS);
        Contract threeYearContract = new Contract("Jane Doe", "77", LocalDate.of(2024, 4, 1), 50000, Contract.ContractLengthYears.THREE_YEARS);
        Contract completedContract = new Contract("Rosie Parker", "47", LocalDate.of(2021, 7, 10), 40000, Contract.ContractLengthYears.One_YEAR);

        RentalSummaryService rentalSummaryService = new RentalSummaryService();
        rentalSummaryService.printRentalSummary(oneYearContract);
        rentalSummaryService.printRentalSummary(twoYearContract); // Should throw a suitable error
        rentalSummaryService.printRentalSummary(threeYearContract);
        rentalSummaryService.printRentalSummary(completedContract); // Should print a message to say the contract is complete

    }

}

