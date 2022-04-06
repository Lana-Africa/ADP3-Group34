package za.ac.cput.domain.entity;

import za.ac.cput.LibrarySystem.domain.entity.Account;

public class TestAccount {

    public static void TestBuilder(){

        Account account = new Account.Builder(1)
            .theirFirstName("James")
            .theirLastName("Hardly")
            .theirDOB("1991-10-01")
            .theirHomeAddress("123 Green Road")
            .accountDateOpened("2010-11-12")
            .build();

        System.out.println(account.toString());
    }

}