package tema8.trabajadores;

import java.time.LocalDateTime;

public class Asalariado extends Trabajador {
    private double salarioBase;
    private int cantidadHorasExtra;

    public Asalariado(double salarioBase, int cantidadHorasExtra, int id, String nome, LocalDateTime datanac) {
        super(id, nome, datanac);
        this.salarioBase = salarioBase;
        this.cantidadHorasExtra = cantidadHorasExtra;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getCantidadHorasExtra() {
        return cantidadHorasExtra;
    }

    public void setCantidadHorasExtra(int cantidadHorasExtra) {
        this.cantidadHorasExtra = cantidadHorasExtra;
    }
    
    public double calcularSalarioFinal(){
        
    }
    
}
