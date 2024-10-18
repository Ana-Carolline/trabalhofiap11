package fiap.trabalho.trabalhofiap.controller;

import fiap.trabalho.trabalhofiap.model.Accident;
import fiap.trabalho.trabalhofiap.service.AccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accident")
public class AccidentController {

    @Autowired
    public AccidentService accidentService;

    @PostMapping
    public ResponseEntity<Void> reportAccident(@RequestBody Accident accident) {
        accidentService.reportAccident(accident);
        return ResponseEntity.ok().build();
    }
}
