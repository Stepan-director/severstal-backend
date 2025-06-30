package com.example.BackendSeverstal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    @Query(value = "select * from photo where name = :name ", nativeQuery = true)
    Optional<Photo> findByName(String name);
}
