import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import week2_education_tasks.incapsulation.Account;


public class AccountTest {
    private Account account;

    @Before
    public void init(){
        account = new Account();
    }

    @Test
    public void getBalanceTest(){
        double balance = 20000.0;
        account.deposit(balance);
        //Assert.assertEquals(0, Double.compare(balance, account.getBalance()));
        Assert.assertEquals(balance, account.getBalance(), 0.0000001);
    }

}
