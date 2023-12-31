package com.selena.repository;

import com.selena.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
