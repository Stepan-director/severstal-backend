package com.example.BackendSeverstal;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository){
        this.photoRepository = photoRepository;
    }

    public List<Photo> getPhoto(){
        return photoRepository.findAll();
    }

    public void addNewPhoto(Photo photo){
        Optional<Photo> photoByName = photoRepository.findByName(photo.getName());
        if (photoByName.isPresent()){
            throw new IllegalStateException("name taken");
        }

        photoRepository.save(photo);
        System.out.println(photo);
    }
}
