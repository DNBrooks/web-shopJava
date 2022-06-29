package com.diplom.webshop.service;

import com.diplom.webshop.domain.Basket;
import com.diplom.webshop.dto.BasketDTO;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface BasketService extends UserDetailsService {

    boolean save(BasketDTO basketDTO);
    void save(Basket basket);
}
