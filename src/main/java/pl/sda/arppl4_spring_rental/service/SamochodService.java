package pl.sda.arppl4_spring_rental.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.arppl4_spring_rental.model.Samochod;

import java.util.List;
import java.util.Scanner;

@Slf4j
@Service
@RequiredArgsConstructor

public class SamochodService {
    private final SamochodService samochodService;

    public static void addSamochod(Samochod samochod) {

    }

    public List<Samochod> getAllSamochod() {
        return null;
    }

    public void updateSamochod(Samochod samochod) {
    }

    public void deleteSamochod(Long identyfikator) {
    }
}