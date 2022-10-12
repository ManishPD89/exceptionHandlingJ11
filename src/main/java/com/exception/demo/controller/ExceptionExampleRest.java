package com.exception.demo.controller;

import com.exception.demo.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exception/")
public class ExceptionExampleRest {

    @Autowired
    private DocumentService documentService;

    @GetMapping("document/{id}")
    public ResponseEntity<Object> findDocumentById(@PathVariable String id) {
        documentService.findById(id);
        return new ResponseEntity<>("Payload", HttpStatus.OK);
    }

}
