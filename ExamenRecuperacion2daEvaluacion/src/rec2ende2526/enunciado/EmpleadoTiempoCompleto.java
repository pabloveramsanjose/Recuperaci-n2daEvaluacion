package rec2ende2526.enunciado;

public class EmpleadoTiempoCompleto extends Empleado{

	public EmpleadoTiempoCompleto(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
		
	}
	
	public void calcularSalarioNeto() {
		
		double salarioBruto = this.salarioBase;
		
		double salarioNeto = salarioBruto - (salarioBruto * irpf);
		
	}

}
