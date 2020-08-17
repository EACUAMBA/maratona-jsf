package br.com.devdojo.maratona_jfs.bean.estudante;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class EstudanteRegistrarBean implements Serializable {
    private int id = 1;
    private String nome = "Edilson";
    private String sobrenome = "Cuamba";
    private double nota1 = 12;
    private double nota2 = 15;
    private double nota3 = 5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
