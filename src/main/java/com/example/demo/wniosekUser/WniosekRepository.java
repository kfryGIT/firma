package com.example.demo.wniosekUser;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface WniosekRepository extends JpaRepository<Wniosek, Long> {

    //!!!!!!!
    Optional<Wniosek> findByName(String name);
}
