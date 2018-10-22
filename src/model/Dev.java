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
		
		areaProcesos.add(new AreaProceso("MA"));
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
		
		areaProcesos.add(new AreaProceso("OPD"));
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
		
		areaProcesos.add(new AreaProceso("OPF"));
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
		
		areaProcesos.add(new AreaProceso("OPM"));
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
		
		areaProcesos.add(new AreaProceso("OPP"));
		areaProcesos.get(8).agregarGg(new Gg("Baselines and models, which characterize the expected process performance of the organization’s set of standard processes, are established and maintained."));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Establish and maintain the organization’s quantitative objectives for quality and process performance, which are traceable to business objectives."));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Select processes or subprocesses in the organization’s set of standard processes to be included in the organization’s process performance analyses and maintain traceability to business objectives."));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades(" Establish and maintain definitions of measures to be included in the organization’s process performance analyses. "));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Analyze the performance of the selected processes, and establish and maintain the process performance baselines. "));
		areaProcesos.get(8).getgG().get(0).agregarActividad(new Actividades("Establish and maintain process performance models for the organization’s set of standard processes"));	
		
	}
	
	public void inicializarOT() {
		
		areaProcesos.add(new AreaProceso("OT"));
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
		
		areaProcesos.add(new AreaProceso("PI"));
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
	public void inicializarVER() {
		
		areaProcesos.add(new AreaProceso("CAR"));
	}
	
	public void inicializarVAL() {
		
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
