package com.swinture.springboot.undertow.controller;

import com.swinture.springboot.undertow.entity.Author;
import com.swinture.springboot.undertow.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: swinture
 * @Version V1.0
 */
@RestController
public class SampleController {

    @RequestMapping("/simple")
    public String simpleStringTest() {
        return "Hello World";
    }

    @RequestMapping("/complex")
    public Object complexObjectTest() {
        Book book = new Book();
        book.setBookName("一只特立独行的猪");
        book.setPrice("28.00元");
        book.setPublishDate(new Date());
        Author author = new Author();
        author.setName("王小波");
        author.setAge(45);
        author.setProfile("作家");
        book.setAuthor(author);

        return book;
    }
}
