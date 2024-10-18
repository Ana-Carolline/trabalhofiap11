package fiap.trabalho.trabalhofiap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.concurrent.Semaphore;


@Service
@Transactional
public class SemaphoreService {

    @Autowired
    public SemaphoreRepository semaphoreRepository;

    public List<Semaphore> getSemaphores() {
        return semaphoreRepository.findAll();
    }

    //public void updateSemaphore(Long id, Semaphore updatedSemaphore) {
    //    Semaphore semaphore = semaphoreRepository.findById(id)
    //            .orElseThrow(() -> new RuntimeException("Semaphore not found with id: " + id));
    //    semaphore.setName(updatedSemaphore.getName());
    //    semaphore.setActive(updatedSemaphore.isActive());
    //    semaphoreRepository.save(semaphore);
    //}

    public void updateSemaphore(Long id, fiap.trabalho.trabalhofiap.model.Semaphore updatedSemaphore) {
    }
}
