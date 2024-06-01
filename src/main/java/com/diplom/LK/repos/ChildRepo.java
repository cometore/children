/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplom.LK.repos;

import com.diplom.LK.domain.Child;
import com.diplom.LK.domain.Group;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kostya
 */
@Repository
public interface ChildRepo  extends JpaRepository<Child, Long>{
    
    List<Child> findByGroup(Group group);
}
