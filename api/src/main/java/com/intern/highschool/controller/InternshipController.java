/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intern.highschool.controller;

import com.intern.highschool.model.Internship;
import com.intern.highschool.repository.InternshipRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tharun Saravanan
 */
@RestController
@RequestMapping("/internship")
@CrossOrigin
public class InternshipController {
    @Autowired
    private InternshipRepository repository;
    
    @GetMapping("/getAll")
    public List<Internship> getAllInternships() {
        List<Internship> result = repository.findAll();
        return result;
    }
}