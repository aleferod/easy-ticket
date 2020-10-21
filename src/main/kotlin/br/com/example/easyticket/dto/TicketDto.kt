package br.com.example.easyticket.dto

import io.swagger.annotations.ApiModelProperty
import io.swagger.annotations.ApiParam
import java.math.BigDecimal
import java.time.LocalDateTime

data class TicketDto(
        var id: String ? = null,
        val nome: String,
        val sobreNome: String,
        val tipoDocumento: String,
        val documento: String,
        val evento: String,
        @ApiModelProperty(
                name =  "dataHoraEvento",
                dataType  = "String",
                value = "Data e Hora do Evento",
                example = "yyyy/MM/dd HH:mm:ss")
        val dataHoraEvento: String,
        val localEvento: String,
        @ApiModelProperty(name =  "valor",
                dataType  = "String",
                value = "Valor monetário do ticket",
                example = "#########.##")
        val valor: String,
        val meioPagamento: String,
        val valido: Boolean
) {
}