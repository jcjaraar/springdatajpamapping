package com.jaranas.springdatajpamapping.repository;

import com.jaranas.springdatajpamapping.dto.OrderResponse;
import com.jaranas.springdatajpamapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.jaranas.springdatajpamapping.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p ")
    public List<OrderResponse> getJoinInformation();
}
