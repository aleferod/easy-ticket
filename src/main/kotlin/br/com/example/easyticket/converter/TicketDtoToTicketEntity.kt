package br.com.example.easyticket.converter


import br.com.example.easyticket.dto.TicketDto
import br.com.example.easyticket.entity.Ticket
import org.springframework.util.StringUtils
import java.security.MessageDigest
import java.time.LocalDateTime
import java.util.*

class TicketDtoToTicketEntity {

    companion object{
        fun convert(ticketDto: TicketDto): Ticket =  Ticket(
                    if(ticketDto.id == null ) generateId() else ticketDto.id,
                    ticketDto.nome,
                    ticketDto.sobreNome,
                    ticketDto.tipoDocumento,
                    ticketDto.documento,
                    ticketDto.evento,
                    convertStringToLocalDateTime(ticketDto.dataHoraEvento),
                    ticketDto.localEvento,
                    ticketDto.valor.toBigDecimal(),
                    ticketDto.meioPagamento,
                    ticketDto.valido
            )

        fun convertStringToLocalDateTime(param: String) : LocalDateTime = LocalDateTime.parse(param)

        fun generateId() : String = UUID.randomUUID().toString();
    }




}