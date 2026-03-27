package rec2ende2526.enunciado;

public class EmpleadoPorHoras extends EmpleadoTiempoCompleto{

	public EmpleadoPorHoras(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
	}
	
	/**
	 * Clase de empleadoPorHoras el cual se le hereda todos los atreibutos de la clase empleados
	 */
	
public double calcularSalarioNeto() {
		
	
		if(!this.autonomo) {
			
			 return super.calcularSalarioNeto();
		
		}else {
			
			double bruto = this.salarioBase;
			 double salarioNeto = bruto - (bruto * 0.07);
		}
		return calcularSalarioNeto();
			
	}
/**
 * Metodo para calcular el salarioNeto
 * @param comision
 * @return
 */
public double calcularSalarioBruto(int comision) {
	
	comision = 10;
	
	double SalarioBruto = this.salarioBase + comision;
	
	if (comision < 0) {
		
		throw new IllegalArgumentException("La comision no puede ser negativa");
	}
	
return  SalarioBruto;
	
}

public double calcularSalarioNeto(int comision) {
	
	comision = 10;
	
	if(!this.autonomo) {
		
		double bruto = this.salarioBase;
		double salarioNeto = (bruto + comision) - (bruto + comision) * 0.07;
		 
	
	}else {
		
		double bruto = this.salarioBase;
		 double salarioNeto = (bruto + comision) - (bruto + comision);
	}
	return calcularSalarioNeto();
		
}


}
