package br.com.example.easyticket.rest.service

import br.com.example.easyticket.converter.TicketDtoToTicketEntity
import br.com.example.easyticket.dto.TicketDto
import br.com.example.easyticket.entity.Ticket
import br.com.example.easyticket.repository.TicketRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class TicketService (val repository: TicketRepository){

    fun save(ticketDto: TicketDto){
        repository.save(TicketDtoToTicketEntity.convert(ticketDto))
    }

    fun findAll(){
        repository.findAll()
    }
    fun findByDocument(document: String) {
        repository.findByDocumento(document)
    }

    fun remove(ticketDto: TicketDto){
        repository.delete(TicketDtoToTicketEntity.convert(ticketDto))
    }
}