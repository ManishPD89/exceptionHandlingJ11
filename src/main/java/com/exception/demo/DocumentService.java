package com.exception.demo;

import com.exception.demo.exceptions.DocumentNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    public Object findById(String id) {
        throw new DocumentNotFoundException();
    }
}
