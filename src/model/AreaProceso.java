package model;

import java.util.ArrayList;
import java.util.List;

public class AreaProceso {
	List<Gg> gG;
	String name;
	
	public AreaProceso(String name) {
		gG= new ArrayList<>();
		this.name = name;
	}
	
	
	public void agregarGg(Gg gg) {
		
		gG.add(gg);
		
	}


	public List<Gg> getgG() {
		return gG;
	}


	public void setgG(List<Gg> gG) {
		this.gG = gG;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
