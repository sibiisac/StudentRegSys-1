package registration;

import org.joda.time.LocalDate;
import java.util.HashMap;
import java.util.List;


public class Course {
	
	private String courseName;
	private HashMap<String, List<Module>> modules;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String cName, LocalDate sDate, LocalDate eDate) {
		this.courseName = cName;
		this.modules = new HashMap<String, List<Module>>();
		this.startDate = sDate;
		this.endDate = eDate;
	}
	//setters
	public void setCourseName(String cName) {
		this.courseName = cName;
	}
	
	public void setStartDate(LocalDate sDate) {
		this.startDate = sDate;
	}
	public void setEndDate(LocalDate eDate) {
		this.endDate = eDate;
	}
	
	public void addModule(String course, List<Module> moduleList) {
		modules.put(course, moduleList);
	}
	//getters
	public String getCourseName() {
		return this.courseName;
	}
	public LocalDate getStartDate() {
		return this.startDate;
	}
	
	public LocalDate getEndDate() {
		return this.endDate;
	}
	public HashMap<String, List<Module>> getModuleList(){
		return modules;
	}


}
