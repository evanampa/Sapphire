package com.sapphire.back.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapphire.back.model.Account;
import com.sapphire.back.service.AccountService;


@RestController
@RequestMapping("/accounts")
@CrossOrigin(origins = "http://127.0.0.1:5500") 
public class AccountController {

  @Autowired
  AccountService accService;

  @GetMapping("")
  public List<Account> getAccounts() {
      return accService.getAllAccounts();
  }
}
