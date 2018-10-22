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
		areaProcesos.get(0).agregarGg(new Gg("	Root causes of selected outcomes are systematically determined"));
		areaProcesos.get(0).getgG().get(0).agregarActividad(new Actividades("Select outcomes for analysis."));
		areaProcesos.get(0).getgG().get(0).agregarActividad(new Actividades("Perform causal analysis of selected outcomes and propose actions to address them."));
		areaProcesos.get(0).agregarGg(new Gg("Root causes of selected outcomes are systematically addressed"));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Implement selected action proposals developed in causal analysis."));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Evaluate the effect of implemented actions on process performance"));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Record causal analysis and resolution data for use across projects and the organization."));
	}
	
	public void inicializarCM() {
		
		areaProcesos.add(new AreaProceso("CM"));
		areaProcesos.get(1).agregarGg(new Gg("Baselines of identified work products are established"));
		areaProcesos.get(1).getgG().get(0).agregarActividad(new Actividades("Identify configuration items, components, and related work products to be placed under configuration management"));
		areaProcesos.get(1).getgG().get(0).agregarActividad(new Actividades("Establish and maintain a configuration management and change management system for controlling work products."));
		areaProcesos.get(1).getgG().get(0).agregarActividad(new Actividades("Create or release baselines for internal use and for delivery to the customer."));
		areaProcesos.get(1).agregarGg(new Gg("Changes to the work products under configuration management are tracked and controlled"));
		areaProcesos.get(1).getgG().get(1).agregarActividad(new Actividades("Track change requests for configuration items."));
		areaProcesos.get(1).getgG().get(1).agregarActividad(new Actividades("Control changes to configuration items."));
		areaProcesos.get(1).agregarGg(new Gg(" Integrity of baselines is established and maintained"));
		areaProcesos.get(1).getgG().get(2).agregarActividad(new Actividades("Establish and maintain records describing configuration items."));
		areaProcesos.get(1).getgG().get(2).agregarActividad(new Actividades("Perform configuration audits to maintain the integrity of configuration baselines"));
		
	}
	
	public void inicializarDAR() {
		
		areaProcesos.add(new AreaProceso("DAR"));
		areaProcesos.get(2).agregarGg(new Gg("Decisions are based on an evaluation of alternatives using established criteria."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Establish and maintain guidelines to determine which issues are subject to a formal evaluation process."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Establish and maintain criteria for evaluating alternatives and the relative ranking of these criteria."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Select evaluation methods"));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Evaluate alternative solutions using established criteria and methods"));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Select solutions from alternatives based on evaluation criteria."));
	}
	
	public void inicializarIPM() {
		
		areaProcesos.add(new AreaProceso("IPM"));
		areaProcesos.get(3).agregarGg(new Gg("Decisions are based on an evaluation of alternatives using established criteria."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain guidelines to determine which issues are subject to a formal evaluation process."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain criteria for evaluating alternatives and the relative ranking of these criteria."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain guidelines to determine which issues are subject to a formal evaluation process."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain criteria for evaluating alternatives and the relative ranking of these criteria."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(3).agregarGg(new Gg("Decisions are based on an evaluation of alternatives using established criteria."));
		areaProcesos.get(3).getgG().get(1).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(3).getgG().get(1).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(3).getgG().get(1).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		
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
