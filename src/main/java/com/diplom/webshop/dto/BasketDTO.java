package com.diplom.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasketDTO {
    private String firstname;
    private String lastname;
    private String lastname2;
    private String email;
    private String address;
    private String phone;
}
