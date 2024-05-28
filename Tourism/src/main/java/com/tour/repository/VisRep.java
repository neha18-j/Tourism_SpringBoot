package com.tour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tour.entity.Visitors;

@Repository
public interface VisRep extends JpaRepository<Visitors, Long> {

}
