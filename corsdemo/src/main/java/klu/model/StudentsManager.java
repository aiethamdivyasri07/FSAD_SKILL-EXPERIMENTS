package klu.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import klu.repo.StudentsRepo;

@Service
public class StudentsManager {
@Autowired
StudentsRepo SR;
//to perform read operation from database we create one method
public List<Students> getData() {
return SR.findAll();

}
}