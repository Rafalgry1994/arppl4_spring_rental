package pl.sda.arppl4_spring_rental.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.arppl4_spring_rental.model.Samochod;
import pl.sda.arppl4_spring_rental.service.SamochodService;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/samochod")


public class SamochodController {

    private final SamochodService samochodService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSamochod(@RequestBody Samochod samochod) {
        log.info("Wywołano dodanie samochodu: " + samochod);
        samochodService.addSamochod(samochod);
    }
    @GetMapping("/list")
    public List<Samochod> getAllSamochod() {
        log.info("Wywołano listę produktów.");
        List<Samochod> list = samochodService.getAllSamochod();
        return list;
    }
    @DeleteMapping("/delete/{identifier}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSamochod(@PathVariable(name = "identifier") Long identyfikator) {
        log.info("Wywołano usunięcie samochodu: " + identyfikator);
        samochodService.deleteSamochod(identyfikator);
    }

    @PatchMapping("/update")
    public void updateSamochod(@RequestBody Samochod samochod) {
        log.info("Wywołano aktualizację samochodu: " + samochod);
        samochodService.updateSamochod(samochod);
    }
}
