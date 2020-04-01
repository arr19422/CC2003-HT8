/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * DIEGO DE JES�S ARREDONDO TURCIOS
 * 19422
 * CC2003 SECCION 30
 * */
public class Paciente implements Comparable<Paciente>{

	String nombre;
	String padecimiento;
	String prioridad;
	
	public Paciente(String nombre, String padecimiento, String prioridad) { 
		this.nombre = nombre;
		this.padecimiento = padecimiento;
		this.prioridad = prioridad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	
	public String getPadecimiento() {
		return padecimiento;
	}
	
	public int compareTo(Paciente paciente) {
        return prioridad.compareTo(paciente.getPrioridad());
    }
	
}
