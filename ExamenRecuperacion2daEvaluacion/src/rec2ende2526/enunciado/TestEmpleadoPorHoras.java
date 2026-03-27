package rec2ende2526.enunciado;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class TestEmpleadoPorHoras {

	private ArrayList<EmpleadoPorHoras> listaEmpleados;
	private String nombre;
	private double salarioBase;
	private boolean esAutonomo;
	private float retencion;
	
	private Empleado empleado;
	




@BeforeAll
public void listarAntes() {
	listaEmpleados = new ArrayList<EmpleadoPorHoras>();
}

@AfterAll
public void limpiarDespues() {
	listaEmpleados = null;
}


@BeforeAll
public void crearEmpleado() {

  empleado = new EmpleadoPorHoras ("Juan",salarioBase,esAutonomo,retencion);
}

@AfterAll
public void limpiarEmpleado() {
	empleado = null;
}

@Ignore("Test para ignorarlo")
public void testSalario() {
	throw new IllegalArgumentException("Este test no funciona");
}

@Parameters
public static Collection<Object[]> parametros() { return Arrays.asList(new Object[][] { 
	
		{1000, 15, false, 850},   
        {2000, 10, false, 1800},  
        {1000, 15, true,  930},   
        {500,  20, true,  465},  
        {1500, 0,  false, 1500}
	
}); 
}

}

