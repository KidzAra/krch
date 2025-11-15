package com.kidz.krch;

import com.kidz.krch.ShortUrl;
import com.kidz.krch.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends CrudRepository<ShortUrl, Long> {
    Optional<ShortUrl> findByShortCode(String shortCode);
}