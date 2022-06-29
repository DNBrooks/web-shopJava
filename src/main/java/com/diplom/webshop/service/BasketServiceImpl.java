package com.diplom.webshop.service;

import com.diplom.webshop.dao.BasketRepository;
import com.diplom.webshop.domain.Basket;
import com.diplom.webshop.dto.BasketDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class BasketServiceImpl implements BasketService {

    private final BasketRepository basketRepository;

    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public boolean save(BasketDTO basketDTO) {

        Basket basket = Basket.builder()
                .firstname(basketDTO.getFirstname())
                .lastname(basketDTO.getLastname())
                .lastname2(basketDTO.getLastname2())
                .email(basketDTO.getEmail())
                .address(basketDTO.getAddress())
                .phone(basketDTO.getPhone())
                .build();
        return true;
    }

    @Override
    public void save(Basket basket) {
        basketRepository.save(basket);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
