package com.example.inquiry.api.service;

import com.example.inquiry.api.request.InsertInquiryRequest;
import org.springframework.stereotype.Service;


public interface InquiryService {
    void insertInquiry(InsertInquiryRequest insertInquiryRequest);
}
