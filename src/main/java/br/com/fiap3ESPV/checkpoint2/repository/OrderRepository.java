package br.com.fiap3ESPV.checkpoint2.repository;

import br.com.fiap3ESPV.checkpoint2.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {
}
