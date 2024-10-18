package fiap.trabalho.trabalhofiap;

import fiap.trabalho.trabalhofiap.service.SemaphoreService;
import fiap.trabalho.trabalhofiap.model.Semaphore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semaphore")
public class SemaphoreController {

    @Autowired
    private SemaphoreService semaphoreService;

    @GetMapping
    public ResponseEntity<List<java.util.concurrent.Semaphore>> getSemaphores() {
        List<java.util.concurrent.Semaphore> semaphores = semaphoreService.getSemaphores();
        return ResponseEntity.ok(semaphores);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateSemaphore(@PathVariable Long id, @RequestBody Semaphore updatedSemaphore) {
        semaphoreService.updateSemaphore(id, updatedSemaphore);
        return ResponseEntity.ok().build();
    }
}
