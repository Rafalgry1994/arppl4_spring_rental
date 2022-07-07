package pl.sda.arppl4_spring_rental.model;



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

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor



public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
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
