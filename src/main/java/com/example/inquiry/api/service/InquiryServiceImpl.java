package com.example.inquiry.api.service;

import com.example.inquiry.api.request.InsertInquiryRequest;
import com.example.inquiry.api.mapper.InquiryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryServiceImpl implements InquiryService {

    @Autowired
    InquiryMapper inquiryMapper;
    @Override
    public void insertInquiry(InsertInquiryRequest insertInquiryRequest) {

        inquiryMapper.insertInquiry(insertInquiryRequest);

    }
}
