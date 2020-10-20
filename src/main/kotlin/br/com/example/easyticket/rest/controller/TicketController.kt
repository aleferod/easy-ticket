package br.com.example.easyticket.rest.controller

import br.com.example.easyticket.dto.TicketDto
import br.com.example.easyticket.entity.Ticket
import br.com.example.easyticket.rest.service.TicketService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/ticket")
class TicketController (val service: TicketService){

    @PostMapping
    fun save(@RequestBody ticketDto: TicketDto) = ResponseEntity.ok(service.save(ticketDto))

    @GetMapping
    fun findAll() = ResponseEntity.ok(service.findAll())

    @GetMapping("/document")
    fun findByDocument(@PathVariable("documento") document: String) = ResponseEntity.ok(service.findByDocument(document))

    @PutMapping
    fun update(@RequestBody ticketDto: TicketDto) = ResponseEntity.ok(service.save(ticketDto))

    @DeleteMapping
    fun remove(@PathVariable("id") id: String) = ResponseEntity.ok(service.remove(id))

}