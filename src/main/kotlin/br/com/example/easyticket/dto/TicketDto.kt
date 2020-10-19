package br.com.example.easyticket.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class TicketDto(
        val id: String ? = null,
        val nome: String,
        val sobreNome: String,
        val tipoDocumento: String,
        val documento: String,
        val evento: String,
        val dataHoraEvento: String,
        val localEvento: String,
        val valor: String,
        val meioPagamento: String,
        val valido: Boolean
) {
}