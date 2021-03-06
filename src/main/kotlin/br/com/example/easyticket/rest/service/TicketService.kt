package br.com.example.easyticket.rest.service

import br.com.example.easyticket.converter.TicketDtoToTicketEntity
import br.com.example.easyticket.dto.TicketDto
import br.com.example.easyticket.entity.Ticket
import br.com.example.easyticket.repository.TicketRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TicketService (val repository: TicketRepository){

    fun save(ticketDto: TicketDto) : Ticket {
        ticketDto.id = ""
        return repository.save(TicketDtoToTicketEntity.convert(ticketDto))
    }

    fun findAll() = repository.findAll()

    fun findByDocument(document: String) = repository.findByDocumento(document)

    fun update(ticketDto: TicketDto) : Ticket {
        val ticketOptional : Optional<Ticket>  = repository.findById(ticketDto.id.toString());
        if(!ticketOptional.isPresent){
            throw Exception("Registro com id " + ticketDto.id + " Nao encontrado na base de dados.")
        }
        return repository.save(TicketDtoToTicketEntity.convert(ticketDto))
    }

    fun remove(id: String) : Ticket {
        val ticket : Ticket = repository.findById(id).orElseThrow( { Exception("Ticket não encontrado com o id " + id)} )
        repository.delete(ticket)
        return ticket
    }

}