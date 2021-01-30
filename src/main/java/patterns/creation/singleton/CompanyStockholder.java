package patterns.creation.singleton;

import lombok.Data;

@Data
public class CompanyStockholder extends Person  {
    private int countOfStock;
    private BankAccount bankAccount;


}
