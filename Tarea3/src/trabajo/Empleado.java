package trabajo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Empleado {
	@Id
	   @GeneratedValue(strategy= GenerationType.AUTO) 
	   private int id;
	   private String nombre;
	   private double salario;
	   private String ocupacion;
	   
	public Empleado() {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.ocupacion = ocupacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}	   
	 @Override
	   public String toString()
	   {
	      return "Empleado [id=" + id + ", nombre=" + nombre + ", salario="
	      + salario + ", ocupacion=" + ocupacion + "]";
	   }  
	   
}
