package com.example.buckpal.account.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


interface AccountRepository extends JpaRepository<AccountJPAEntity, Long> {
}