package fiap.trabalho.trabalhofiap.service;

import fiap.trabalho.trabalhofiap.model.TrafficPattern;
import org.springframework.stereotype.Service;

@Service
public class TrafficPatternService {

    public TrafficPattern getTrafficPattern() {

        return new TrafficPattern();
    }
}
