package com.abhibhr.conferencedemo.repositories;

import com.abhibhr.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
