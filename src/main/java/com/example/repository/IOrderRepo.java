package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Order;

import java.util.List;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Integer>{

}
