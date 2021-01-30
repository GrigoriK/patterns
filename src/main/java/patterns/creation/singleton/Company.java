package patterns.creation.singleton;

import lombok.Data;

@Data
public class Company {
    private String name;
    private CompanyBod companyBod;
    private String address;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", companyBod=" + companyBod.toString() +
                ", address='" + address + '\'' +
                '}';
    }
}
