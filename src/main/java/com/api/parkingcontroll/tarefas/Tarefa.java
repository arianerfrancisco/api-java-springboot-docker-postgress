package com.api.parkingcontroll.tarefas;

import javax.persistence.*;
//import javax.persistence.Table;

@Entity
//@Table(name="tarefa") como a classe tem o mesmo nome da tabela do BD, pode-se ignorar essa anotação.
public class Tarefa {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
