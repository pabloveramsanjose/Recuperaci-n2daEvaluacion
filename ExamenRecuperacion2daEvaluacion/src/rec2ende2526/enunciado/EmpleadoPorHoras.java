package rec2ende2526.enunciado;

public class EmpleadoPorHoras extends EmpleadoTiempoCompleto{

	public EmpleadoPorHoras(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
	}
	
public void calcularSalarioNeto() {
		
		if(this.autonomo) {

			double salarioBruto = this.salarioBase;
				
				double salarioNeto = salarioBruto - (salarioBruto * 0.07);
		}else {
			return ;
		}
		
	}

}
