package org.jianyi.fiveelements.service;

import org.jianyi.fiveelements.domain.Qi;
import org.jianyi.fiveelements.repository.QiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class QiService {

    @Autowired
    private QiRepository qiRepository;

    public Mono<Qi> save(Qi qi) {
        return qiRepository.save(qi);
    }


}
