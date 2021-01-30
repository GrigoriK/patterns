package patterns.creation.singleton;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Data
@Slf4j
public class BankAccount  {
    private UUID id;
    private String accountNumber;
    private Person holder;
    private int countOfFounds;



    public void transferMoney(BankAccount transferBankAccount, int transferCountOfFunds) {
        if (transferCountOfFunds < 0) {
            log.error("Count of funds less then nil");
        } else if (transferBankAccount == null) {
            log.error("TransferBankAccount is null");
        } else {
            int countOfFounds = this.getCountOfFounds();
            if (transferCountOfFunds > countOfFounds) {
                log.info("Transfer was canceled. Account count of funds less then necessary");
            } else {
                log.info("Start transfer.");
                this.setCountOfFounds(countOfFounds - transferCountOfFunds);
                transferBankAccount.setCountOfFounds(transferBankAccount.getCountOfFounds()
                        + transferCountOfFunds);
                log.info("Transfer money {} from {} to {} .", countOfFounds,
                        transferBankAccount.getAccountNumber(), this.getAccountNumber());
            }
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", holder=" + holder.toString() +
                ", countOfFounds=" + countOfFounds +
                '}';
    }
}
