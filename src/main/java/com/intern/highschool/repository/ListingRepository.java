/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intern.highschool.repository;

import com.intern.highschool.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tharun Saravanan
 */
@Repository
public interface ListingRepository extends JpaRepository<Listing, Integer> {
    
}
