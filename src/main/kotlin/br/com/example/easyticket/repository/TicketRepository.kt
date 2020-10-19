package br.com.example.easyticket.repository

import br.com.example.easyticket.entity.Ticket
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TicketRepository : MongoRepository<Ticket, Long> {
    fun findByDocumento(documento: String) : Optional<Ticket>

    fun findById(id: String) : Optional<Ticket>
}