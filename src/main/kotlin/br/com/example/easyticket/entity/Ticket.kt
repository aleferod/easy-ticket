package br.com.example.easyticket.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.Id

@Document(collection = "ticket")
data class Ticket(
        @Id
        val id: String?,
        val nome: String,
        val sobreNome: String,
        val tipoDocumento: String,
        val documento: String,
        val evento: String,
        val dataHoraEvento: LocalDateTime,
        val localEvento: String,
        val valor: BigDecimal,
        val meioPagamento: String,
        val valido: Boolean

){

}