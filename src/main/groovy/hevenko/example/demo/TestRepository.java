package hevenko.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestRow, Long> {
}
