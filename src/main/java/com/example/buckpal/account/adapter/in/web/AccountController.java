package com.example.buckpal.account.adapter.in.web;

import com.example.buckpal.account.application.port.in.SendMoneyService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private SendMoneyService sendMoneyService;
}
