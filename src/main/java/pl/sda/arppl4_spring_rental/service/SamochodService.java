package service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class SamochodService {

    private final SamochodService samochodService;

    public SamochodService(SamochodService samochodService) {
        this.samochodService = samochodService;
    }
}
