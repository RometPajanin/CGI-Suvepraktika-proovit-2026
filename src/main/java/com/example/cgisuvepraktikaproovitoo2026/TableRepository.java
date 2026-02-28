package com.example.cgisuvepraktikaproovitoo2026;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TableRepository extends JpaRepository<Table, UUID> {
}
