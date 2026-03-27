package rec2ende2526.enunciado;

/**
 * @author: Pablo Vera Martinez
 * @version: 1.0
 */

public abstract class Empleado {

    private static final int SALARIO_MINIMO_INTERPROFESIONAL = 1221;
	protected String nombre;
    protected double salarioBase;
    protected boolean autonomo;
    protected float irpf;
    
    /**
     * 
     * @param nombre: Nombre del empleado
     * @param salarioBase: Salario base del empleado
     * @param autonomo: Boolean que marca si es autonomo o no
     * @param irpf: Porcentaje que es el irpf 
     */
    
    

	public Empleado(String nombre, double salarioBase, Boolean autonomo, float irpf) {
        if (salarioBase < SALARIO_MINIMO_INTERPROFESIONAL) {
            throw new IllegalArgumentException("El salario base no puede ser negativo");
        }
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.autonomo = autonomo;
        this.irpf=irpf;
    }
	/**
	 * 
	 * @param nombre
	 * Constructor de la clase empleado con una excepcion
	 */
	public Empleado(String nombre) {
        this.nombre = nombre;
        this.salarioBase = SALARIO_MINIMO_INTERPROFESIONAL;
        this.autonomo = false;
        this.irpf=0;
    }
	
	/**
	 * Constructor con polimorfismo el cual solo se pasa el parametro de nombre
	 * @return
	 */
	
    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public boolean isAutonomo() {
    	return autonomo;
    }

    public float getIrpf() {
		return irpf;
	}
    
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setAutonomo(boolean autonomo) {
		this.autonomo = autonomo;
	}

	public void setIrpf(float irpf) {
		this.irpf = irpf;
	}
	
	
	public double calcularSalariaBruto(double pagaExtra, int numeroMeses) {
		
		double salarioBruto = (salarioBase + (pagaExtra/numeroMeses));
		return salarioBruto;
		
	}
	/**
	 * Metodo que se le ha pasado los parametros de la de pagaExtra y NUmerosMEses que calcula el salario bruto
	 */
	public void calcularSalariaNeto() {
		
	}
	
	/** 
	 * Metodo Abstracto para calcular el salarioNeto
	 */
}
