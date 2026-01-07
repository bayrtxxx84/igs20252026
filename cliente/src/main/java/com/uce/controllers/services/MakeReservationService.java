package com.uce.controllers.services;

import com.uce.logic.usercases.user.MakeReservationUserCase;
import com.uce.logic.validators.Result;

public class MakeReservationService {

    private MakeReservationUserCase userCase;

    public MakeReservationService(MakeReservationUserCase userCase) {
        this.userCase = userCase;
    }

    public Result<String> makeReservation(
            String userName,
            java.sql.Date fechaReserva,
            int numeroComensales) {

        var reserva = userCase.makeReservation(userName, fechaReserva, numeroComensales);

        return reserva.fold(
                val -> Result.success(val.getReservaId()),
                ex -> Result.failure(ex));
    }

}
