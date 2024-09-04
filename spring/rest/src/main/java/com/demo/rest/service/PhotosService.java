package com.demo.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.rest.model.Photos;
@Service
public class PhotosService {
    public List<Photos> getAllPhotos(){
        RestTemplate restTemplate=new RestTemplate();
        List<Photos> photos=restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos",List.class);
        return photos;
    }

}
