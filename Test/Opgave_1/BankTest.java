package Opgave_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank("Data/Opgave_1_accounts.csv");
    @BeforeEach
    void setUp() {

    }

    @Test
    void deposit() {

        Account a=bank.getAllAccounts().get(1);

         bank.deposit(1, 500);

         assertEquals(600, a.getBalance());



    }
}