package com.example.Pertemuan11.repository;

import com.example.Pertemuan11.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,String> {
}
