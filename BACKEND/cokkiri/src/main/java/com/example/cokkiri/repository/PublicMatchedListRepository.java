package com.example.cokkiri.repository;

import com.example.cokkiri.model.PublicMatchedList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface PublicMatchedListRepository extends JpaRepository<PublicMatchedList,String> {
    public List<PublicMatchedList> findByStudentIdListContains(String id);
}
