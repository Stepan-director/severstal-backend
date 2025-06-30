package com.example.BackendSeverstal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;
import java.util.List;

@RestController
public class PhotoController {
    private  final PhotoService photoService;

    @Autowired
    public PhotoController(PhotoService photoService){
        this.photoService = photoService;
    }

    @GetMapping
    public List<Photo> getPhoto(){
        return photoService.getPhoto();
    }

    @PostMapping
    public void addNewPhoto(@RequestBody Photo photo){
        photoService.addNewPhoto(photo);
    }
}
