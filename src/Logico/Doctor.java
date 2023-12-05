package Logico;

public class Doctor extends Persona {

	
	private String Especialidad;

	public Doctor(String nombre, String id, int numeroTelefonico, String especialidad) {
		super(nombre, id, numeroTelefonico);
		setEspecialidad(especialidad);
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
	
}
