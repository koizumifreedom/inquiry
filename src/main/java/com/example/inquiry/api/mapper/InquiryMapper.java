package com.example.inquiry.api.mapper;

import com.example.inquiry.api.request.InsertInquiryRequest;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface InquiryMapper {
    void insertInquiry(InsertInquiryRequest insertInquiryRequest);
}
