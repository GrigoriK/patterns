package patterns.creation.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Slf4j
public class CompaniesUnion {
    public static void getCompaniesUnion() {
        //Netcracker
        Company companyNetcracker = new Company();
        companyNetcracker.setName("Netcracker");
        companyNetcracker.setAddress("University Office Park,95 Sawyer Road Waltham, MA 02453");

        CompanyCEO companyNetcrackerCEO = new CompanyCEO();
        companyNetcrackerCEO.setName("Andrew");
        companyNetcrackerCEO.setSurname("Feinberg");
        companyNetcrackerCEO.setGender("male");
        companyNetcrackerCEO.setTelephone("1111-1111-1111");

        CompanyBod bodNetcracker = new CompanyBod();
        bodNetcracker.setCompanyCEO(companyNetcrackerCEO);
        bodNetcracker.setCompanyStockholders(getCompanyStockholder());

        companyNetcracker.setCompanyBod(bodNetcracker);
        //Apple
        Company companyApple = new Company();
        companyApple.setName("Apple");
        companyApple.setAddress("Apple, One Apple Park Way, Cupertino, CA 95014");

        CompanyCEO companyAppleCEO = new CompanyCEO();
        companyAppleCEO.setName("Tim");
        companyAppleCEO.setSurname("Cook");
        companyAppleCEO.setGender("male");
        companyAppleCEO.setTelephone("0000-0000-0000");

        CompanyBod appleBod = new CompanyBod();
        appleBod.setCompanyCEO(companyAppleCEO);
        appleBod.setCompanyStockholders(getCompanyStockholder());

        companyApple.setCompanyBod(appleBod);
        printFullInformationOfUnion(companyNetcracker, companyApple);

    }

    private static void printFullInformationOfUnion(Company company1, Company company2) {
        if(company1!=null) {
            log.info("Company1: {}", company1.toString());
        }
        if(company2!=null) {
            log.info("Company2: {}", company2.toString());
        }
    }

    private static BankAccount getTestBankAccount() {
        BankAccount bankAccount = new BankAccount();
        Person person = new Person();
        person.setName("Michail");
        person.setGender("male");
        person.setSurname("Nichaev");
        person.setTelephone("88888-88888");
        person.setAddress("Moscow, Tverskay street, 38");

        bankAccount.setId(UUID.randomUUID());
        bankAccount.setAccountNumber("2384783784738748334");
        bankAccount.setCountOfFounds(100000);
        bankAccount.setHolder(person);
        return bankAccount;

    }

    private static Collection<CompanyStockholder> getCompanyStockholder() {
        Collection<CompanyStockholder> companyStockholders = new ArrayList<CompanyStockholder>();
        for (int i = 0; i < 100; i++) {
            CompanyStockholder companyStockholder = new CompanyStockholder();
            companyStockholder.setBankAccount(getTestBankAccount());
            companyStockholder.setCountOfStock(300);
            companyStockholder.setName("Person " + (i + 1));
            companyStockholder.setSurname("Test");
            companyStockholder.setTelephone("398472-7432894238");
            companyStockholder.setGender("male");
            companyStockholder.setAddress("Russia");
            companyStockholders.add(companyStockholder);
        }

        return companyStockholders;
    }
}
