package com.example.eureka_client.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handlerFileUpload(@RequestPart(value = "file") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        return file.getOriginalFilename();
    }
}
