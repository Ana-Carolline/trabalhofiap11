package fiap.trabalho.trabalhofiap.controller;

import fiap.trabalho.trabalhofiap.model.WasteCollection;
import fiap.trabalho.trabalhofiap.service.WasteCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coleta-de-lixo")
public class WasteCollectionController {

    @Autowired
    private WasteCollectionService wasteCollectionService;

    @GetMapping
    public ResponseEntity<List<WasteCollection>> getWasteCollections() {
        List<WasteCollection> wasteCollections = wasteCollectionService.getWasteCollections();
        return ResponseEntity.ok(wasteCollections);
    }
}
