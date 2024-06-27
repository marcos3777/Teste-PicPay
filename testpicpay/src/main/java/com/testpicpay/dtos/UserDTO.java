package com.testpicpay.dtos;

import com.testpicpay.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, String email, BigDecimal balance, String password, UserType userType){
}
