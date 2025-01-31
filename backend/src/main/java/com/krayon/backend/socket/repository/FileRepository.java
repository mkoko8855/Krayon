package com.krayon.backend.socket.repository;

import com.krayon.backend.socket.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, String> {
}
