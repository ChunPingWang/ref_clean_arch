package com.example.buckpal.account.adapter.out.persistence;

import com.example.buckpal.account.domain.Account;

public class AccountMapper {

    public Account mapToDomainEntity(String name){
        return new Account();
    }
}
