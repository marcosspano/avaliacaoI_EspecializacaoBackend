package com.dh.catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "MOVIE")
public interface MovieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/movies/{genre}")
    

}