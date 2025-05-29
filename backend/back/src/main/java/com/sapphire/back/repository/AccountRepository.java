package com.sapphire.back.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sapphire.back.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}