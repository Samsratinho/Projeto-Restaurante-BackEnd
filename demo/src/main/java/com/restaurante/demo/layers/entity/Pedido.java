package com.restaurante.demo.layers.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"cliente_id", "id"}))
public class Pedido {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private Date data;

  @Column(nullable = false)
  private String email;
  
  @Column(nullable = false)
  private Long mesa;

  @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
  private List<Cliente> clientes;

  @OneToMany
  private List<ProdutoPedido> produtoPedidos; 

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getMesa() {
    return mesa;
  }

  public void setMesa(Long mesa) {
    this.mesa = mesa;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }
}
