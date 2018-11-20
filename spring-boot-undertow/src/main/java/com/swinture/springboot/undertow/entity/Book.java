package com.swinture.springboot.undertow.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: swinture
 * @Version V1.0
 */
@Data
public class Book {

    private String bookName;
    private Date publishDate;
    private String price;
    private Author author;
}
