package com.uce.logic.usercases.user;

import java.sql.Date;

import com.uce.data.entities.ReservaEntity;
import com.uce.logic.validators.UUIDReservers;

public class MakeReservationUserCase {

    public String makeReservation(String userName,
            Date fechaReserva,
            int numeroComensales) {

        var reserva = ReservaEntity.builder()
                .userName(userName)
                .fechaReserva(fechaReserva)
                .estadoReserva("PENDIENTE")
                .mesaReservada(-1)
                .numeroComensales(numeroComensales);

        reserva.reservaId(UUIDReservers.generateUUID());

        return reserva.build().getReservaId();
    }
}
