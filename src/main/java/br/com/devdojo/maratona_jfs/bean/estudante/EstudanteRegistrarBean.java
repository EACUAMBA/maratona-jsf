package br.com.devdojo.maratona_jfs.bean.estudante;

import br.com.devdojo.maratona_jfs.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
