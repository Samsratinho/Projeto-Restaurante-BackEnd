package com.restaurante.demo.layers.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private String email;
  
  @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
  private List<Pedido> pedido;

  public Long getId(){
    return id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public List<Pedido> getPedido(){
    return pedido;
  }

  public void setPedido(List<Pedido> pedido){
    this.pedido = pedido;
  }

}
