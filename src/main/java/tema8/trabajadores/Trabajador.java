package tema8.trabajadores;

import java.time.LocalDateTime;

public class Trabajador {
    private int id;
    private String nome;
    private LocalDateTime datanac;

    public Trabajador(int id, String nome, LocalDateTime datanac) {
        this.id = id;
        this.nome = nome;
        this.datanac = this.datanac;
    }

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

    public LocalDateTime getFechanac() {
        return datanac;
    }

    public void setFechanac(LocalDateTime fechanac) {
        this.datanac = fechanac;
    }
    
    @Override
    public String toString(){
        return "id: " + id + " - nome: " + nome ;
    }
    
}
