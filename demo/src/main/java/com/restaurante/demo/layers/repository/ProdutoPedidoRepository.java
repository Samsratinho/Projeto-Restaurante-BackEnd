package com.restaurante.demo.layers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.demo.layers.entity.ProdutoPedido;

@Repository
public interface ProdutoPedidoRepository extends JpaRepository<ProdutoPedido, Long>{
    
}