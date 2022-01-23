package de.solovyov.spring.app.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReservationDTO {

    private Long id;

    @NotNull
    private LocalDate reservationDate;

    @NotNull
    @Schema(type = "string", example = "14:30")
    private LocalTime reservationStartTime;

    @NotNull
    @Schema(type = "string", example = "14:30")
    private LocalTime reservationEndTime;

    @NotNull
    private Long userId;

    @NotNull
    private Long user;

}
