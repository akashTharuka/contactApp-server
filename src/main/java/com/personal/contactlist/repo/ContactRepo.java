package com.personal.contactlist.repo;

import com.personal.contactlist.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    @Override
    Optional<Contact> findById(String id);
}
