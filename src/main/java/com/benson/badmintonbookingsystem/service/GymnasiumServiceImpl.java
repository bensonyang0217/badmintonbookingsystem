package com.benson.badmintonbookingsystem.service;

import com.benson.badmintonbookingsystem.model.Gymnasium;
import com.benson.badmintonbookingsystem.repository.GymnasiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymnasiumServiceImpl implements GymnasiumService {

    @Autowired
    private GymnasiumRepository gymnasiumRepository;

    @Override
    public Gymnasium addGymnasium(Gymnasium gymnasium) {
        return gymnasiumRepository.save(gymnasium);
    }
}
