package klu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import klu.model.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long>{

}
