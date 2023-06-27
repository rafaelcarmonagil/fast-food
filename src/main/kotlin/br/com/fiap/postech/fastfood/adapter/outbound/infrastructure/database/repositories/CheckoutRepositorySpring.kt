package br.com.fiap.postech.fastfood.adapter.outbound.infrastructure.database.repositories

import br.com.fiap.postech.fastfood.adapter.outbound.infrastructure.database.entities.CheckoutEntity
import br.com.fiap.postech.fastfood.adapter.outbound.infrastructure.database.entities.PedidoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CheckoutRepositorySpring: JpaRepository<CheckoutEntity, UUID> {

    fun findByPedido(pedidoEntity: PedidoEntity): Optional<CheckoutEntity>
}