package model;

import java.util.ArrayList;
import java.util.List;

public class Dev {

	
	List<AreaProceso> areaProcesos;
	
	public Dev() {
		areaProcesos= new ArrayList<>();
		inicializarCAR();
		inicializarCM();
		inicializarDAR();
		inicializarGG2();
		inicializarGG3();
		inicializarIPM();
		inicializarMA();
		inicializarOPD();
		inicializarOPF();
		inicializarOPM();
		inicializarOPP();
		inicializarOT();
		inicializarPI();
		inicializarPMC();
		inicializarPP();
		inicializarPPQA();
		inicializarQPM();
		inicializarRD();
		inicializarREQM();
		inicializarRSKM();
		inicializarSAM();
		inicializarTS();
		inicializarTS();
		inicializarVAL();
		inicializarVER();
		
		
	}
	
	public String interactador(int a, int b, String area) {
		String r ="";
		if(a>b || a<0) {
			r += "Invalid Input";
			return r;
		}
		if(a>=3) {
			r +="You are in the max level";
			return r;
		}
		if (a == b) {
			return "You are alredy in this level";
		}
		
		for (int i = a+1; i < b; i++) {
			r += txt(i, area);
		}
		
		return r;
	}
	
	public String txt(int x, String area) {
		String r = "";
		
		switch(x) {
		
		case 1:
			AreaProceso p = null;
			for (int i = 0; i < areaProcesos.size(); i++) {
				if(area.equalsIgnoreCase(areaProcesos.get(i).getName())) {
					p = areaProcesos.get(i);
				}
			}
			if(p == null) {
				r = "There is no Process Area introduced";
				return r;
			}
			r += "GG 1:  Achieve Specific Goals "+" \n";
			for (int i = 0; i < p.getgG().size(); i++) {
				r += "   SG "+i+": "+p.getgG().get(i).getName()+" \n";
				for (int j = 0; j < p.getgG().get(i).getActividades().size(); j++) {
					r +="   SP "+i+"."+j+": "+p.getgG().get(i).getActividades().get(j).getActividad()+" \n";
				}
			}
			break;
			
		case 2:
			AreaProceso pp = null;
			for (int i = 0; i < areaProcesos.size(); i++) {
				if(area.equalsIgnoreCase(areaProcesos.get(i).getName())) {
					pp = areaProcesos.get(i);
				}
			}
			if(pp == null) {
				r = "There is no Process Area introduced";
				return r;
			}
			r += "GG 2: "+areaProcesos.get(areaProcesos.size()-2).getgG().get(0).getName()+" \n";
			for (int i = 0; i < areaProcesos.get(areaProcesos.size()-2).getgG().size(); i++) {
				r +="   GP 2."+i+": "+areaProcesos.get(areaProcesos.size()-2).getgG().get(0).getActividades().get(i).getActividad()+" \n";
			}
			
			break;
		case 3:
			
			AreaProceso ppp = null;
			for (int i = 0; i < areaProcesos.size(); i++) {
				if(area.equalsIgnoreCase(areaProcesos.get(i).getName())) {
					ppp = areaProcesos.get(i);
				}
			}
			if(ppp == null) {
				r = "There is no Process Area introduced";
				return r;
			}
			r += "GG 3: "+areaProcesos.get(areaProcesos.size()-1).getgG().get(0).getName()+" \n";
			for (int i = 0; i < areaProcesos.get(areaProcesos.size()-1).getgG().size(); i++) {
				r +="   GP 3."+i+": "+areaProcesos.get(areaProcesos.size()-2).getgG().get(0).getActividades().get(i).getActividad()+" \n";
			}
			
			break;
			
			default:
				r += "There is no other level";
		
		}
		
		return r;
		
	}
	
	
	public void inicializarCAR() {
		
		areaProcesos.add(0, new AreaProceso("CAR"));
		areaProcesos.get(0).agregarGg(new Gg("	Root causes of selected outcomes are systematically determined"));
		areaProcesos.get(0).getgG().get(0).agregarActividad(new Actividades("Select outcomes for analysis."));
		areaProcesos.get(0).getgG().get(0).agregarActividad(new Actividades("Perform causal analysis of selected outcomes and propose actions to address them."));
		areaProcesos.get(0).agregarGg(new Gg("Root causes of selected outcomes are systematically addressed"));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Implement selected action proposals developed in causal analysis."));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Evaluate the effect of implemented actions on process performance"));
		areaProcesos.get(0).getgG().get(1).agregarActividad(new Actividades("Record causal analysis and resolution data for use across projects and the organization."));
	}
	
	public void inicializarCM() {
		
		areaProcesos.add(1, new AreaProceso("CM"));
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
		
		areaProcesos.add(2, new AreaProceso("DAR"));
		areaProcesos.get(2).agregarGg(new Gg("Decisions are based on an evaluation of alternatives using established criteria."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Establish and maintain guidelines to determine which issues are subject to a formal evaluation process."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Establish and maintain criteria for evaluating alternatives and the relative ranking of these criteria."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Identify alternative solutions to address issues."));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Select evaluation methods"));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Evaluate alternative solutions using established criteria and methods"));
		areaProcesos.get(2).getgG().get(0).agregarActividad(new Actividades("Select solutions from alternatives based on evaluation criteria."));
	}
	
	public void inicializarIPM() {
		
		areaProcesos.add(3, new AreaProceso("IPM"));
		areaProcesos.get(3).agregarGg(new Gg("The project is conducted using a defined process tailored from the organization’s set of standard processes"));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the project’s defined process from project startup through the life of the project."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Use organizational process assets and the measurement repository for estimating and planning project activities"));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the project’s work environment based on the organization’s work environment standards."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Integrate the project plan and other plans that affect the project to describe the project’s defined process"));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Manage the project using the project plan, other plans that affect the project, and the project’s defined process."));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Establish and maintain teams"));
		areaProcesos.get(3).getgG().get(0).agregarActividad(new Actividades("Contribute process related experiences to organizational process assets."));
		
		areaProcesos.get(3).agregarGg(new Gg("Coordination and collaboration between the project and relevant stakeholders are conducted."));
		areaProcesos.get(3).getgG().get(1).agregarActividad(new Actividades("Manage the involvement of relevant stakeholders in the project. "));
		areaProcesos.get(3).getgG().get(1).agregarActividad(new Actividades("Participate with relevant stakeholders to identify, negotiate, and track critical dependencies."));
		areaProcesos.get(3).getgG().get(1).agregarActividad(new Actividades("Resolve issues with relevant stakeholders."));
		
	}
	
	public void inicializarMA() {
		
		areaProcesos.add(4, new AreaProceso("MA"));
		areaProcesos.get(4).agregarGg(new Gg("Measurement objectives and activities are aligned with identified information needs and objectives."));
		areaProcesos.get(4).getgG().get(0).agregarActividad(new Actividades("Establish and maintain measurement objectives derived from identified information needs and objectives."));
		areaProcesos.get(4).getgG().get(0).agregarActividad(new Actividades("Specify measures to address measurement objectives."));
		areaProcesos.get(4).getgG().get(0).agregarActividad(new Actividades("Specify how measurement data are obtained and stored."));
		areaProcesos.get(4).getgG().get(0).agregarActividad(new Actividades("Specify how measurement data are analyzed and communicated"));
		
		areaProcesos.get(4).agregarGg(new Gg("Measurement results, which address identified information needs and objectives, are provided."));
		areaProcesos.get(4).getgG().get(1).agregarActividad(new Actividades("Obtain specified measurement data "));
		areaProcesos.get(4).getgG().get(1).agregarActividad(new Actividades("Analyze and interpret measurement data."));
		areaProcesos.get(4).getgG().get(1).agregarActividad(new Actividades("Manage and store measurement data, measurement specifications, and analysis results."));
		areaProcesos.get(4).getgG().get(1).agregarActividad(new Actividades("Communicate results of measurement and analysis activities to all relevant stakeholders."));
	}
	
	public void inicializarOPD() {
		
		areaProcesos.add(5, new AreaProceso("OPD"));
		areaProcesos.get(5).agregarGg(new Gg("A set of organizational process assets is established and maintained."));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the organization’s set of standard processes"));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain descriptions of lifecycle models approved for use in the organization"));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain tailoring criteria and guidelines for the organization’s set of standard processes."));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the organization’s measurement repository."));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the organization’s process asset library."));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain work environment standards."));
		areaProcesos.get(5).getgG().get(0).agregarActividad(new Actividades("Establish and maintain organizational rules and guidelines for the structure, formation,and operation of teams."));
	}
	
	public void inicializarOPF() {
		
		areaProcesos.add(6, new AreaProceso("OPF"));
		areaProcesos.get(6).agregarGg(new Gg("Strengths, weaknesses, and improvement opportunities for the organization’s processes are identified periodically and as needed."));
		areaProcesos.get(6).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the description of process needs and objectives for the organization"));
		areaProcesos.get(6).getgG().get(0).agregarActividad(new Actividades("Appraise the organization’s processes periodically and as needed to maintain an understanding of their strengths and weaknesses."));
		areaProcesos.get(6).getgG().get(0).agregarActividad(new Actividades("Identify improvements to the organization’s processes and process assets."));
		
		areaProcesos.get(6).agregarGg(new Gg(" Process actions that address improvements to the organization’s processes and process assets are planned and implemented."));
		areaProcesos.get(6).getgG().get(1).agregarActividad(new Actividades("Establish and maintain process action plans to address improvements to the organization’s processes and process assets."));
		areaProcesos.get(6).getgG().get(1).agregarActividad(new Actividades("Implement process action plans"));
		
		areaProcesos.get(6).agregarGg(new Gg(" Organizational process assets are deployed across the organization and process related experiences are incorporated into organizational process assets."));
		areaProcesos.get(6).getgG().get(2).agregarActividad(new Actividades("Deploy organizational process assets across the organization."));
		areaProcesos.get(6).getgG().get(2).agregarActividad(new Actividades("Deploy the organization’s set of standard processes to projects at their startup and deploy changes to them as appropriate throughout the life of each project"));
		areaProcesos.get(6).getgG().get(2).agregarActividad(new Actividades("Monitor the implementation of the organization’s set of standard processes and use of process assets on all projects."));
		areaProcesos.get(6).getgG().get(2).agregarActividad(new Actividades("Incorporate process related experiences derived from planning and performing the process into organizational process assets."));
	}
	
	public void inicializarOPM() {
		
		areaProcesos.add(7, new AreaProceso("OPM"));
		areaProcesos.get(7).agregarGg(new Gg("The organization’s business performance is managed using statistical and other quantitative techniques to understand process performance shortfalls and identify areas for process improvement."));
		areaProcesos.get(7).getgG().get(0).agregarActividad(new Actividades("Maintain business objectives based on an understanding of business strategies and actual performance results"));
		areaProcesos.get(7).getgG().get(0).agregarActividad(new Actividades("Analyze process performance data to determine the organization’s ability to meet identified business objectives. "));
		areaProcesos.get(7).getgG().get(0).agregarActividad(new Actividades("Identify potential areas for improvement that could contribute to meeting business objectives. "));
		
		areaProcesos.get(7).agregarGg(new Gg(" Improvements are proactively identified, evaluated using statistical and other quantitative techniques, and selected for deployment based on their contribution to meeting quality and process performance objectives"));
		areaProcesos.get(7).getgG().get(1).agregarActividad(new Actividades("Elicit and categorize suggested improvements"));
		areaProcesos.get(7).getgG().get(1).agregarActividad(new Actividades("Analyze suggested improvements for their possible impact on achieving the organization’s quality and process performance objectives. "));
		areaProcesos.get(7).getgG().get(1).agregarActividad(new Actividades("Validate selected improvements."));
		areaProcesos.get(7).getgG().get(1).agregarActividad(new Actividades("Select and implement improvements for deployment throughout the organization based on an evaluation of costs, benefits and other factors."));
		
		areaProcesos.get(7).agregarGg(new Gg("Measurable improvements to the organization’s processes and technologies are deployed and evaluated using statistical and other quantitative techniques. "));
		areaProcesos.get(7).getgG().get(2).agregarActividad(new Actividades("Establish and maintain plans for deploying selected improvements."));
		areaProcesos.get(7).getgG().get(2).agregarActividad(new Actividades("Manage the deployment of selected improvements."));
		areaProcesos.get(7).getgG().get(2).agregarActividad(new Actividades("Evaluate the effects of deployed improvements on quality and process performance using statistical and other quantitative techniques. "));
		
	}
	
	public void inicializarOPP() {
		
		areaProcesos.add(8, new AreaProceso("OPP"));
		areaProcesos.get(8).agregarGg(new Gg("Baselines and models, which characterize the expected process performance of the organization’s set of standard processes, are established and maintained."));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the organization’s quantitative objectives for quality and process performance, which are traceable to business objectives."));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Select processes or subprocesses in the organization’s set of standard processes to be included in the organization’s process performance analyses and maintain traceability to business objectives."));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades(" Establish and maintain definitions of measures to be included in the organization’s process performance analyses. "));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Analyze the performance of the selected processes, and establish and maintain the process performance baselines. "));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Establish and maintain process performance models for the organization’s set of standard processes"));	
		
	}
	
	public void inicializarOT() {
		
		areaProcesos.add(9, new AreaProceso("OT"));
		areaProcesos.get(9).agregarGg(new Gg("A training capability, which supports the roles in the organization, is established and maintained."));
		areaProcesos.get(9).getgG().get(0).agregarActividad(new Actividades("Establish and maintain strategic training needs of the organization."));
		areaProcesos.get(9).getgG().get(0).agregarActividad(new Actividades("Determine which training needs are the responsibility of the organization and which are left to the individual project or support group."));
		areaProcesos.get(9).getgG().get(0).agregarActividad(new Actividades("Establish and maintain an organizational training tactical plan"));
		areaProcesos.get(9).getgG().get(0).agregarActividad(new Actividades("Establish and maintain a training capability to address organizational training needs."));	
		areaProcesos.get(9).agregarGg(new Gg("Training for individuals to perform their roles effectively is provided."));
		areaProcesos.get(9).getgG().get(1).agregarActividad(new Actividades("Deliver training following the organizational training tactical plan."));
		areaProcesos.get(9).getgG().get(1).agregarActividad(new Actividades("Establish and maintain records of organizational training."));	
		areaProcesos.get(9).getgG().get(1).agregarActividad(new Actividades("Assess the effectiveness of the organization’s training program "));
			
	}
	
	public void inicializarPI() {
		
		areaProcesos.add(10, new AreaProceso("PI"));
		areaProcesos.get(10).agregarGg(new Gg(" Preparation for product integration is conducted. "));
		areaProcesos.get(10).getgG().get(0).agregarActividad(new Actividades("Establish and maintain a product integration strategy. "));
		areaProcesos.get(10).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the environment needed to support the integration of the product components."));
		areaProcesos.get(10).getgG().get(0).agregarActividad(new Actividades("Establish and maintain procedures and criteria for integration of the product components. "));
		areaProcesos.get(10).agregarGg(new Gg("The product component interfaces, both internal and external, are compatible."));
		areaProcesos.get(10).getgG().get(1).agregarActividad(new Actividades("Review interface descriptions for coverage and completeness."));
		areaProcesos.get(10).getgG().get(1).agregarActividad(new Actividades("Manage internal and external interface definitions, designs, and changes for products and product components. "));	
		areaProcesos.get(10).agregarGg(new Gg("Verified product components are assembled and the integrated, verified and validated product is delivered."));
		areaProcesos.get(10).getgG().get(2).agregarActividad(new Actividades("1 Confirm, prior to assembly, that each product component required to assemble the product has been properly identified, behaves according to its description, and that the product component interfaces comply with the interface descriptions. "));
		areaProcesos.get(10).getgG().get(2).agregarActividad(new Actividades("Assemble product components according to the product integration strategy and procedures. "));	
		areaProcesos.get(10).getgG().get(2).agregarActividad(new Actividades("Evaluate assembled product components for interface compatibility.  "));
		areaProcesos.get(10).getgG().get(2).agregarActividad(new Actividades(" Package the assembled product or product component and deliver it to the customer."));	
	}
	
	public void inicializarPMC() {
		
		areaProcesos.add(11, new AreaProceso("PMC"));
		areaProcesos.get(11).agregarGg(new Gg("Actual project performance and progress are monitored against the project plan."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Monitor actual values of project planning parameters against the project plan."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Monitor commitments against those identified in the project plan."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Monitor risks against those risks identified in the project plan."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Monitor the management of project data against the project plan."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Monitor stakeholder involvement against the project plan."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Periodically review the project’s progress, performance, and issues."));
		areaProcesos.get(11).getgG().get(0).agregarActividad(new Actividades("Review the project’s accomplishments and results at selected project milestones."));
		
		areaProcesos.get(11).agregarGg(new Gg(" Corrective actions are managed to closure when the project’s performance or results deviate significantly from the plan."));
		areaProcesos.get(11).getgG().get(1).agregarActividad(new Actividades("Collect and analyze issues and determine corrective actions to address them."));
		areaProcesos.get(11).getgG().get(1).agregarActividad(new Actividades("Take corrective action on identified issues"));
		areaProcesos.get(11).getgG().get(1).agregarActividad(new Actividades("Manage corrective actions to closure."));
	}
	
	public void inicializarPP() {
		
		areaProcesos.add(12, new AreaProceso("PP"));
		areaProcesos.get(12).agregarGg(new Gg("Estimates of project planning parameters are established and maintained."));
		areaProcesos.get(12).getgG().get(0).agregarActividad(new Actividades("Establish a top-level work breakdown structure (WBS) to estimate the scope of the project"));
		areaProcesos.get(12).getgG().get(0).agregarActividad(new Actividades("Establish and maintain estimates of work product and task attributes"));
		areaProcesos.get(12).getgG().get(0).agregarActividad(new Actividades("Define project lifecycle phases on which to scope the planning effort."));
		areaProcesos.get(12).getgG().get(0).agregarActividad(new Actividades("Estimate the project’s effort and cost for work products and tasks based on estimation rationale."));
		
		areaProcesos.get(12).agregarGg(new Gg("Actual project performance and progress are monitored against the project plan."));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Establish and maintain the project’s budget and schedule."));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Identify and analyze project risks."));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Plan for the management of project data"));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Plan for resources to perform the project. "));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Plan for knowledge and skills needed to perform the project. "));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Plan the involvement of identified stakeholders."));
		areaProcesos.get(12).getgG().get(1).agregarActividad(new Actividades("Establish and maintain the overall project plan."));
		
		areaProcesos.get(12).agregarGg(new Gg("Actual project performance and progress are monitored against the project plan."));
		areaProcesos.get(12).getgG().get(2).agregarActividad(new Actividades("Review all plans that affect the project to understand project commitments."));
		areaProcesos.get(12).getgG().get(2).agregarActividad(new Actividades("Adjust the project plan to reconcile available and estimated resources."));
		areaProcesos.get(12).getgG().get(2).agregarActividad(new Actividades("Obtain commitment from relevant stakeholders responsible for performing and supporting plan execution."));
	}
	
	public void inicializarPPQA() {
		
		areaProcesos.add(13, new AreaProceso("PPQA"));
		areaProcesos.get(13).agregarGg(new Gg("Adherence of the performed process and associated work products to applicable process descriptions, standards, and procedures is objectively evaluated."));
		areaProcesos.get(13).getgG().get(0).agregarActividad(new Actividades("Objectively evaluate selected performed processes against applicable process descriptions, standards, and procedures."));
		areaProcesos.get(13).getgG().get(0).agregarActividad(new Actividades("Objectively evaluate selected work products against applicable process descriptions, standards, and procedures."));
		
		areaProcesos.get(13).agregarGg(new Gg("Noncompliance issues are objectively tracked and communicated, and resolution is ensured."));
		areaProcesos.get(13).getgG().get(1).agregarActividad(new Actividades("Communicate quality issues and ensure the resolution of noncompliance issues with the staff and managers."));
		areaProcesos.get(13).getgG().get(1).agregarActividad(new Actividades("Establish and maintain records of quality assurance activities."));
	}
	
	public void inicializarQPM() {
		
		areaProcesos.add(14, new AreaProceso("QPM"));
		areaProcesos.get(14).agregarGg(new Gg("Preparation for quantitative management is conducted. "));
		areaProcesos.get(14).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the project’s quality and process performance objectives. "));
		areaProcesos.get(14).getgG().get(0).agregarActividad(new Actividades("Using statistical and other quantitative techniques, compose a defined process that enables the project to achieve its quality and process performance objectives. "));
		areaProcesos.get(14).getgG().get(0).agregarActividad(new Actividades("Select subprocesses and attributes critical to evaluating performance and that help to achieve the project’s quality and process performance objectives."));
		areaProcesos.get(14).getgG().get(0).agregarActividad(new Actividades("Select measures and analytic techniques to be used in quantitative management. "));
		
		areaProcesos.get(14).agregarGg(new Gg("The project is quantitatively managed."));
		areaProcesos.get(14).getgG().get(1).agregarActividad(new Actividades("Monitor the performance of selected subprocesses using statistical and other quantitative techniques."));
		areaProcesos.get(14).getgG().get(1).agregarActividad(new Actividades("Manage the project using statistical and other quantitative techniques to determine whether or not the project’s objectives for quality and process performance will be satisfied."));
		areaProcesos.get(14).getgG().get(1).agregarActividad(new Actividades("Perform root cause analysis of selected issues to address deficiencies in achieving the project’s quality and process performance objectives."));
	}
	
	public void inicializarRD() {
		
		areaProcesos.add(15, new AreaProceso("RD"));
		areaProcesos.get(15).agregarGg(new Gg("Stakeholder needs, expectations, constraints, and interfaces are collected and translated into customer requirements."));
		areaProcesos.get(15).getgG().get(0).agregarActividad(new Actividades("Elicit stakeholder needs, expectations, constraints and interfaces for all phases of the product lifecycle. "));
		areaProcesos.get(15).getgG().get(0).agregarActividad(new Actividades("Transform stakeholder needs, expectations, constraints and interfaces into prioritized customer requirements"));
		
		areaProcesos.get(15).agregarGg(new Gg("Customer requirements are refined and elaborated to develop product and product component requirements.  "));
		areaProcesos.get(15).getgG().get(1).agregarActividad(new Actividades("Establish and maintain product and product component requirements, which are based on the customer requirements. "));
		areaProcesos.get(15).getgG().get(1).agregarActividad(new Actividades("Allocate the requirements for each product component. "));
		areaProcesos.get(15).getgG().get(1).agregarActividad(new Actividades("Identify interface requirements. "));
		
		areaProcesos.get(15).agregarGg(new Gg("The requirements are analyzed and validated. "));
		areaProcesos.get(15).getgG().get(2).agregarActividad(new Actividades("Establish and maintain operational concepts and associated scenarios. "));
		areaProcesos.get(15).getgG().get(2).agregarActividad(new Actividades("Establish and maintain a definition of required functionality and quality attributes. "));
		areaProcesos.get(15).getgG().get(2).agregarActividad(new Actividades("Analyze requirements to ensure that they are necessary and sufficient."));
		areaProcesos.get(15).getgG().get(2).agregarActividad(new Actividades("Analyze requirements to balance stakeholder needs and constraints. "));
		areaProcesos.get(15).getgG().get(2).agregarActividad(new Actividades("Validate requirements to ensure the resulting product will perform as intended in the end user’s environment."));
	}
	
	public void inicializarREQM() {
		
		areaProcesos.add(16, new AreaProceso("REQM"));
		areaProcesos.get(16).agregarGg(new Gg("Requirements are managed and inconsistencies with plans and work products are identified."));
		areaProcesos.get(16).getgG().get(0).agregarActividad(new Actividades("Develop an understanding with the requirements providers on the meaning of the requirements."));
		areaProcesos.get(16).getgG().get(0).agregarActividad(new Actividades("Obtain commitment to requirements from project participants."));
		areaProcesos.get(16).getgG().get(0).agregarActividad(new Actividades("Manage changes to requirements as they evolve during the project."));
		areaProcesos.get(16).getgG().get(0).agregarActividad(new Actividades("Maintain bidirectional traceability among requirements and work products"));
		areaProcesos.get(16).getgG().get(0).agregarActividad(new Actividades("Ensure that project plans and work products remain aligned with the requirements."));
	}
	
	public void inicializarRSKM() {
		
		areaProcesos.add(17, new AreaProceso("RSKM"));
		areaProcesos.get(17).agregarGg(new Gg("Preparation for risk management is conducted."));
		areaProcesos.get(17).getgG().get(0).agregarActividad(new Actividades("Determine risk sources and categories."));
		areaProcesos.get(17).getgG().get(0).agregarActividad(new Actividades("Define parameters used to analyze and categorize risks and to control the risk management effort."));
		areaProcesos.get(17).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the strategy to be used for risk management."));
		
		areaProcesos.get(17).agregarGg(new Gg("Risks are identified and analyzed to determine their relative importance."));
		areaProcesos.get(17).getgG().get(1).agregarActividad(new Actividades("Identify and document risks."));
		areaProcesos.get(17).getgG().get(1).agregarActividad(new Actividades("Evaluate and categorize each identified risk using defined risk categories and parameters, and determine its relative priority."));
		
		areaProcesos.get(17).agregarGg(new Gg("Risks are handled and mitigated as appropriate to reduce adverse impacts on achieving objectives."));
		areaProcesos.get(17).getgG().get(2).agregarActividad(new Actividades("Develop a risk mitigation plan in accordance with the risk management strategy."));
		areaProcesos.get(17).getgG().get(2).agregarActividad(new Actividades("Monitor the status of each risk periodically and implement the risk mitigation plan as appropriate."));
	}
	
	public void inicializarSAM() {
		
		areaProcesos.add(18, new AreaProceso("SAM"));
		areaProcesos.get(18).agregarGg(new Gg("Agreements with the suppliers are established and maintained."));
		areaProcesos.get(18).getgG().get(0).agregarActividad(new Actividades("Determine the type of acquisition for each product or product component to be acquired."));
		areaProcesos.get(18).getgG().get(0).agregarActividad(new Actividades("Select suppliers based on an evaluation of their ability to meet the specified requirements and established criteria."));
		areaProcesos.get(18).getgG().get(0).agregarActividad(new Actividades("Establish and maintain supplier agreements."));
		
		areaProcesos.get(18).agregarGg(new Gg("Agreements with suppliers are satisfied by both the project and the supplier."));
		areaProcesos.get(18).getgG().get(1).agregarActividad(new Actividades("Perform activities with the supplier as specified in the supplier agreement."));
		areaProcesos.get(18).getgG().get(1).agregarActividad(new Actividades("Ensure that the supplier agreement is satisfied before accepting the acquired product."));
		areaProcesos.get(18).getgG().get(1).agregarActividad(new Actividades("Ensure the transition of products acquired from the supplier."));
	}
	
	public void inicializarTS() {
		
		areaProcesos.add(19, new AreaProceso("TS"));
		areaProcesos.get(19).agregarGg(new Gg("Product or product component solutions are selected from alternative solutions."));
		areaProcesos.get(19).getgG().get(0).agregarActividad(new Actividades("Develop alternative solutions and selection criteria."));
		areaProcesos.get(19).getgG().get(0).agregarActividad(new Actividades("Select the product component solutions based on selection criteria."));
		
		areaProcesos.get(19).agregarGg(new Gg("Product or product component designs are developed."));
		areaProcesos.get(19).getgG().get(1).agregarActividad(new Actividades("Develop a design for the product or product component."));
		areaProcesos.get(19).getgG().get(1).agregarActividad(new Actividades("Establish and maintain a technical data package."));
		areaProcesos.get(19).getgG().get(1).agregarActividad(new Actividades("Design product component interfaces using established criteria."));
		areaProcesos.get(19).getgG().get(1).agregarActividad(new Actividades("Evaluate whether the product components should be developed, purchased, or reused based on established criteria."));
				
		areaProcesos.get(19).agregarGg(new Gg("Preparation for risk management is conducted."));
		areaProcesos.get(19).getgG().get(2).agregarActividad(new Actividades("Implement the designs of the product components."));
		areaProcesos.get(19).getgG().get(2).agregarActividad(new Actividades("Develop and maintain the end-use documentation."));
	}
	
	public void inicializarVER() {
		
		areaProcesos.add(20, new AreaProceso("VER"));
		areaProcesos.get(20).agregarGg(new Gg("Preparation for validation is conducted."));
		areaProcesos.get(20).getgG().get(0).agregarActividad(new Actividades("Select products and product components to be validated and validation methods to be used."));
		areaProcesos.get(20).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the environment needed to support validation."));
		areaProcesos.get(20).getgG().get(0).agregarActividad(new Actividades("Establish and maintain procedures and criteria for validation."));
		
		areaProcesos.get(20).agregarGg(new Gg("The product or product components are validated to ensure they are suitable for use in their intended operating environment."));
		areaProcesos.get(20).getgG().get(1).agregarActividad(new Actividades("Perform validation on selected products and product components."));
		areaProcesos.get(20).getgG().get(1).agregarActividad(new Actividades("Analyze results of validation activities."));
	}
	
	public void inicializarVAL() {
		
		areaProcesos.add(21, new AreaProceso("VAL"));
		areaProcesos.get(21).agregarGg(new Gg("Preparation for verification is conducted."));
		areaProcesos.get(21).getgG().get(0).agregarActividad(new Actividades("Select work products to be verified and verification methods to be used."));
		areaProcesos.get(21).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the environment needed to support verification.."));
		areaProcesos.get(21).getgG().get(0).agregarActividad(new Actividades("Establish and maintain verification procedures and criteria for the selected work products."));
		
		areaProcesos.get(21).agregarGg(new Gg("Peer reviews are performed on selected work products. "));
		areaProcesos.get(21).getgG().get(1).agregarActividad(new Actividades("Prepare for peer reviews of selected work products."));
		areaProcesos.get(21).getgG().get(1).agregarActividad(new Actividades("Conduct peer reviews of selected work products and identify issues resulting from these reviews."));
		areaProcesos.get(21).getgG().get(1).agregarActividad(new Actividades("Analyze data about the preparation, conduct, and results of the peer reviews."));
		
		areaProcesos.get(21).agregarGg(new Gg("Selected work products are verified against their specified requirements."));
		areaProcesos.get(21).getgG().get(2).agregarActividad(new Actividades("Perform verification on selected work products."));
		areaProcesos.get(21).getgG().get(2).agregarActividad(new Actividades("Analyze results of all verification activities."));
		
	}
	
	public void inicializarGG2() {
		
		areaProcesos.add(22, new AreaProceso("GG 2"));
		areaProcesos.get(22).agregarGg(new Gg(" Institutionalize a Managed Process."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Establish and maintain an organizational policy for planning and performing the process."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the plan for performing the process."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Provide adequate resources for performing the process, developing the work products, and providing the services of the process."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Assign responsibility and authority for performing the process, developing the work products, and providing the services of the process."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Train the people performing or supporting the process as needed."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Place selected work products of the process under appropriate levels of control."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Identify and involve the relevant stakeholders of the process as planned."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Monitor and control the process against the plan for performing the process and take appropriate corrective action."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades("Objectively evaluate adherence of the process and selected work products against the process description, standards, and procedures, and address noncompliance."));
		areaProcesos.get(22).getgG().get(0).agregarActividad(new Actividades(" Review the activities, status, and results of the process with higher level management and resolve issues."));
		
	}
	
	public void inicializarGG3() {
		
		areaProcesos.add(23, new AreaProceso("GG 3"));
		areaProcesos.get(23).agregarGg(new Gg("Institutionalize a Defined Process"));
		areaProcesos.get(23).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the description of a defined process"));
		areaProcesos.get(23).getgG().get(0).agregarActividad(new Actividades("Collect process related experiences derived from planning and performing the process to support the future use and improvement of the organization’s processes and process assets."));
		
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