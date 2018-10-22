package model;

import java.util.ArrayList;
import java.util.List;

public class Dev {

	
	List<AreaProceso> areaProcesos;
	
	public Dev() {
		areaProcesos= new ArrayList<>();
	}
	
	
	public void inicializarCAR() {
		
		areaProcesos.add(new AreaProceso("CAR"));
		areaProcesos.get(0).agregarGg(new Gg("Root causes of selected outcomes are systematically determined"));
		areaProcesos.get(0).getgG().get(0).agregarActividad(new Actividades("Select outcomes for analysis."));
		areaProcesos.get(0).getgG().get(0).agregarActividad(new Actividades("Perform causal analysis of selected outcomes and propose actions to address them."));
		areaProcesos.get(0).agregarGg(new Gg("Root causes of selected outcomes are systematically addressed"));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Implement selected action proposals developed in causal analysis."));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Evaluate the effect of implemented actions on process performance"));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Record causal analysis and resolution data for use across projects and the organization."));
	}
	
	public void inicializarCM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarDAR() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarIPM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarMA() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarVER() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarVAL() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarOPD() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarOPF() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarOPP() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarOPM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarOT() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarPI() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarPMC() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarPP() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarPPQA() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarQPM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarRD() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarREQM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarRSKM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarSAM() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarTS() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	
	public void agregarAreaProceso(AreaProceso area) {
		areaProcesos.add(area);
	}


	public List<AreaProceso> getAreaProcesos() {
		return areaProcesos;
	}


	public void setAreaProcesos(List<AreaProceso> areaProcesos) {
		this.areaProcesos = areaProcesos;
	}
	
	
}
