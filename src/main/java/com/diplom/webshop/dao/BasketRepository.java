package com.diplom.webshop.dao;

import com.diplom.webshop.domain.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long> {
}

