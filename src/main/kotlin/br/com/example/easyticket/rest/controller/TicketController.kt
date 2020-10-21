package br.com.example.easyticket.rest.controller

import br.com.example.easyticket.dto.TicketDto
import br.com.example.easyticket.entity.Ticket
import br.com.example.easyticket.rest.service.TicketService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/ticket")
class TicketController (val service: TicketService){

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(
            value = "Salvar Ticket",
            notes = "Inserir novo ticket"
    )
    fun save(@RequestBody ticketDto: TicketDto) = ResponseEntity.ok(service.save(ticketDto))

    @GetMapping
    @ApiOperation(value = "Consultar tickets",
            notes = "Consultar todos os tickets")
    fun findAll() = ResponseEntity.ok(service.findAll())

    @GetMapping("/document")
    @ApiOperation(value = "Consultar ticket",
            notes = "Consultar ticket através do número de documento")
    fun findByDocument(@PathVariable("documento") document: String) = ResponseEntity.ok(service.findByDocument(document))

    @PutMapping
    @ApiOperation(value = "Editar ticket")
    fun update(@RequestBody ticketDto: TicketDto) = ResponseEntity.ok(service.update(ticketDto))

    @DeleteMapping
    @ApiOperation(value = "Deletar ticket")
    fun remove(@PathVariable("id") id: String) = ResponseEntity.ok(service.remove(id))

}