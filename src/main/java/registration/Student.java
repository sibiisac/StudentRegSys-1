package registration;


import org.joda.time.LocalDate;
import org.joda.time.Years;
public class Student {
		
		private String name;
		private int age;
		private LocalDate DOB;
		private long ID;
		private String userName;
		
		public Student(String stdName, LocalDate stdDoB, long stdId) {
			this.name = stdName;
			this.DOB = stdDoB;
			LocalDate currentDate = new LocalDate();
			this.age = Years.yearsBetween(DOB, currentDate).getYears();
			this.ID = stdId;
		}
		
		// mutators
		public void setName(String stdName) {
			this.name = stdName;
		}
		
		
		public void setDOB (LocalDate std_dob) {
			this.DOB = std_dob;
		}
		public void setID (long std_Id) {
			this.ID = std_Id;
		}

		
		//accessors
		public String getName() {
			return this.name;
		}
		public int getAge() {
			return this.age;
		}
		
		public LocalDate getDOB() {
			return this.DOB;
		}
		
		public long getID() {
			return this.ID;
		}
		public String getUsername() {
			StringBuilder sb = new StringBuilder();
			for (char ch : name.toCharArray()) {
				if (ch !=  ' ') {
					sb.append(ch);
				}
			}	
			userName = sb.toString() + getAge();
			return userName;
		}


}
