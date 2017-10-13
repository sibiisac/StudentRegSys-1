package registration;

import java.util.HashMap;
import java.util.List;


public class Module {
	
	private String moduleName;
	private String moduleID;
	private HashMap<String, List<Student>> studentList;
	
	//constructor
	public Module(String mName, String mId) {
		this.moduleName = mName;
		this.moduleID = mId;
		studentList = new HashMap<String, List<Student>>();
	}
	//setters
	public void setModuleName(String mName) {
		this.moduleName = mName;
	}
	
	public void setModuleId(String mId) {
		this.moduleID = mId;
	}
	
	public void addStudent (String module, List<Student> stdList) {
		studentList.put(module, stdList);
	}
	//getters
	public String getModuleName() {
		return this.moduleName;
	}
	public String getModuleID() {
		return this.moduleID;
	}
	public HashMap<String, List<Student>> getStudentList(){
		return studentList;
	}


}
