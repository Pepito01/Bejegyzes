package hu.petrik;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok = 0;
    private LocalDateTime letrejott = LocalDateTime.now();
    private LocalDateTime szerkesztve = LocalDateTime.now();
}
