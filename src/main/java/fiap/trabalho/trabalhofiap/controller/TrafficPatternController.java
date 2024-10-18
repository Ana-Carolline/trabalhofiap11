package fiap.trabalho.trabalhofiap.controller;

import fiap.trabalho.trabalhofiap.model.TrafficPattern;
import fiap.trabalho.trabalhofiap.service.TrafficPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/traffic-pattern")
public class TrafficPatternController {

    @Autowired
    private TrafficPatternService trafficPatternService;

    @GetMapping
    public ResponseEntity<TrafficPattern> getTrafficPattern() {
        TrafficPattern trafficPattern = trafficPatternService.getTrafficPattern();
        return ResponseEntity.ok(trafficPattern);
    }
}
