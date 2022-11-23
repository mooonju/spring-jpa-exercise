package com.springbootjpaapi.repository;

import com.springbootjpaapi.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
