package com.pack.onetrust.repos;

import com.pack.onetrust.models.Trusted;
import com.pack.onetrust.models.Truster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrustedRepository extends JpaRepository<Trusted, Long> {
}