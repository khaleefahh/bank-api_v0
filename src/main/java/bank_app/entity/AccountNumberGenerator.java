package bank_app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class AccountNumberGenerator {

    @Id
    private int id;
    private long bankCode;
    private long branchCode;
    private long customerCode;


    public synchronized Long generateAcctNumber() {
        String concatAcctNum = String.format("%s%s%s", bankCode, branchCode, customerCode);
        Long parseAcctNum = Long.parseLong(concatAcctNum);
        customerCode++;
        return parseAcctNum;
    }

    public AccountNumberGenerator() {}


}