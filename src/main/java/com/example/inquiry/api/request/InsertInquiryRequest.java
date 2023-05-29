package com.example.inquiry.api.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InsertInquiryRequest {

    @NotBlank(message = "")
    private String name;
    
    @NotBlank
    private String furigana;

    @NotBlank
    private String phone_number;

    @NotBlank
    private String mail_address;

    @NotBlank
    private String content_of_inquiry;

    private String company_name;
    @NotBlank
    private String free_comment;

}
