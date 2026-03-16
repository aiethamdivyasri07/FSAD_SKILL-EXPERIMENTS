package klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.model.Students;
import klu.model.StudentsManager;

@RestController
@RequestMapping("students")
public class StudentsController {
@Autowired
StudentsManager SM;
@GetMapping("getdata")
public List<Students> getData()
{
return SM.getData();
}
}