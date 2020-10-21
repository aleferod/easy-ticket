package br.com.example.easyticket.converter


import br.com.example.easyticket.dto.TicketDto
import br.com.example.easyticket.entity.Ticket
import org.springframework.util.StringUtils
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class TicketDtoToTicketEntity {

    companion object{
        fun convert(ticketDto: TicketDto): Ticket =  Ticket(
                    if( StringUtils.isEmpty(ticketDto.id)  ) generateId() else ticketDto.id,
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

        fun convertStringToLocalDateTime(param: String) : LocalDateTime {
            val formatter : DateTimeFormatter  = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            return LocalDateTime.parse(param,formatter)
        }

        fun generateId() : String = UUID.randomUUID().toString();
    }




}