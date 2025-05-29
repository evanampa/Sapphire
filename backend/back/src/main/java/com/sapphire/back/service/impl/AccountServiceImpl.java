package com.sapphire.back.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sapphire.back.model.Account;
import com.sapphire.back.repository.AccountRepository;
import com.sapphire.back.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  AccountRepository accRepository;

  @Override
  public List<Account> getAllAccounts() {
    return accRepository.findAll();
  }

}
