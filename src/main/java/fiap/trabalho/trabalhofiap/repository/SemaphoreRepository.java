package fiap.trabalho.trabalhofiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.Semaphore;

@Repository
public interface SemaphoreRepository extends JpaRepository<Semaphore, Long> {
}
