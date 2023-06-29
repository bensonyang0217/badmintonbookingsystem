package com.benson.badmintonbookingsystem.controller;

import com.benson.badmintonbookingsystem.model.Gymnasium;
import com.benson.badmintonbookingsystem.service.GymnasiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gymnasium")
public class GymnasiumController {

    @Autowired
    private GymnasiumService gymnasiumService;

    @PostMapping
    public Gymnasium createGymnasium(@RequestBody Gymnasium gymnasium) {
        return gymnasiumService.addGymnasium(gymnasium);
    }

}
