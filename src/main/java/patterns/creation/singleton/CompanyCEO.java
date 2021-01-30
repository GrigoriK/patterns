package patterns.creation.singleton;

import lombok.Data;

@Data
public class CompanyCEO  {
    private BankAccount bankAccount;
    private String name;
    private String surname;
    private String gender;
    private String telephone;

    @Override
    public String toString() {
        return "CompanyCEO{" +
                (bankAccount!=null ?"bankAccount=" + bankAccount.toString()+", " :"")+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
