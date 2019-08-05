package org.jianyi.fiveelements.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients;
import org.springframework.data.elasticsearch.config.AbstractReactiveElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@Configuration
@EnableReactiveElasticsearchRepositories("org.jianyi.fiveelements.repository")
public class ElasticsearchConfig extends AbstractReactiveElasticsearchConfiguration {

    @Override
    public ReactiveElasticsearchClient reactiveElasticsearchClient() {

        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();

        return ReactiveRestClients.create(clientConfiguration);
    }

}
