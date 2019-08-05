package org.jianyi.fiveelements.repository;

import org.jianyi.fiveelements.domain.Qi;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QiRepository extends ReactiveSortingRepository<Qi, String> {
}
