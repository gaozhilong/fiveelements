package org.jianyi.fiveelements.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "qi", type = "qi", shards = 1, replicas = 0, refreshInterval = "-1")
public class Qi {

    @Id
    private String id;

    private String name;

}