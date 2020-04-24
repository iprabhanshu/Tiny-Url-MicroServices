package com.prabhanshu.tinyurl.repository;

import com.prabhanshu.tinyurl.model.TinyURL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TinyURLRepository extends JpaRepository<TinyURL, Integer> {
}
