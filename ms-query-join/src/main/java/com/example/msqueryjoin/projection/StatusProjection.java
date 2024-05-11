package com.example.msqueryjoin.projection;

import com.example.coreapi.events.ChambreAddedEvent;
import com.example.coreapi.events.ChambreRemovedEvent;
import com.example.coreapi.events.ReservationAddedEvent;
import com.example.coreapi.events.ReservationRemovedEvent;
import com.example.msqueryjoin.entities.StatusTable;
import com.example.msqueryjoin.repository.StatusTableRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatusProjection {

    @Autowired
    private StatusTableRepository statusTableRepository;


    //----A complèter-------------
}
