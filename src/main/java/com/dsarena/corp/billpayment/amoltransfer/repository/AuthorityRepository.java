package com.dsarena.corp.billpayment.amoltransfer.repository;

import com.dsarena.corp.billpayment.amoltransfer.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
