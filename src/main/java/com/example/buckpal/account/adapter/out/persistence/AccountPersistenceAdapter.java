package com.example.buckpal.account.adapter.out.persistence;

import com.example.buckpal.account.application.port.out.LoadAccountPort;
import com.example.buckpal.account.application.port.out.UpdateAccountStatePort;
import org.springframework.stereotype.Component;

@Component
public class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountStatePort {
    private AccountRepository accountRepository;
    private ActivityRepository activityRepository;



}
