package com.uce.controllers.services;

import com.uce.logic.usercases.user.MakeReservationUserCase;

public class MakeReservationService {

    private MakeReservationUserCase userCase;

    public MakeReservationService(MakeReservationUserCase userCase) {
        this.userCase = userCase;
    }

    public String makeReservation(String userName,
            java.sql.Date fechaReserva,
            int numeroComensales) {

        return userCase.makeReservation(userName, fechaReserva, numeroComensales);

    }

}
