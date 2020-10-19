package br.com.example.easyticket.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories("br.com.example.easyticket.repository")
class MongoDataSource {
}