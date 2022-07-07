package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import service.SamochodService;

@RequiredArgsConstructor
@Slf4j
@RestController

public class SamochodController {

    private final SamochodService samochodService;

}
