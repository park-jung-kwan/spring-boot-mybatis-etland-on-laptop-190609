package com.newjersey.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * MemberDTO
 */
@Data @Lazy @Component
public class CustomerDTO {
    private String userid,password, username, birth, mail, phone, profilephoto;

}