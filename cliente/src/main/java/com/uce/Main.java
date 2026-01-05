package com.uce;

import com.uce.controllers.services.MakeReservationService;
import com.uce.logic.usercases.user.MakeReservationUserCase;

public class Main {
    public static void main(String[] args) {

        MakeReservationService service = new MakeReservationService(
                new MakeReservationUserCase());

        String reservaId = service.makeReservation("JuanPerez",
                java.sql.Date.valueOf("2024-07-15"), 4);
                
        System.out.println("Reserva creada con ID: " + reservaId);
    }
}
