package com.example.inquiry.api.controller;

import com.example.inquiry.api.request.InsertInquiryRequest;
import com.example.inquiry.api.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/api")
    public class InquiryController {

        @Autowired
        InquiryService inquiryService;
        @PostMapping("/inquiryInsert")
        @ResponseStatus(HttpStatus.CREATED)
        public void insertInquiry(@Validated @ModelAttribute InsertInquiryRequest insertInquiryRequest, BindingResult result) {
            result.getAllErrors();
            //インプットしたデータをDBに登録する
            inquiryService.insertInquiry(insertInquiryRequest);
        }
    }

