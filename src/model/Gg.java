package model;

import java.util.ArrayList;
import java.util.List;

public class Gg {
	
	
	List<Actividades> actividades;
	String name;
	
	public Gg(String name) {
		actividades= new ArrayList<>();
		this.name = name;
	}
	
	
	
	public void agregarActividad(Actividades ac) {
		actividades.add(ac);
		
	}



	public List<Actividades> getActividades() {
		return actividades;
	}



	public void setActividades(List<Actividades> actividades) {
		this.actividades = actividades;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	

}
