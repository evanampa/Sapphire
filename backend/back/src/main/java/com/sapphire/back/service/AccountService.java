package com.sapphire.back.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sapphire.back.model.Account;

@Service
public interface AccountService {

  public List<Account> getAllAccounts();

}
