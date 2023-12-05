package Logico;

import java.util.Date;

public class Cita {

	private Paciente paciente;
	private Doctor doctor;
	private Date fecha;
	
	public Cita(Paciente paciente, Doctor doctor, Date fecha) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
