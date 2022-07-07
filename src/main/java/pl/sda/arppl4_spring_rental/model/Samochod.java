package model;



//- nazwa
//- marka
//- data produkcji (pełna data, nie tylko rocznik, ale bez czasu)
//- typ nadwozia (SEDAN, CABRIO, SUV)
//- ilość pasażerów / miejsc siedzących
//- typ skrzyni biegów (MANUAL, AUTO)
//- pojemność silnika (Double)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor


public class Samochod {
    @Id


    private String nazwa;
    private String marka;
    private LocalDate dataProdukcji;

    @Enumerated(EnumType.STRING)
    private TypNadwozia typNadwozia;

    private Integer seats;

    @Enumerated(EnumType.STRING)
    private TypSkrzyni typSkrzyni;

    private Double pojemnoscSilnika;




}
