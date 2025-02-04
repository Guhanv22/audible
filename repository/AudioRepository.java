package com.example.audible.repository;
import com.example.audible.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioRepository extends JpaRepository<Audio,Integer>
{
}

