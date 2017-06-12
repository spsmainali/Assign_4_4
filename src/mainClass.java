class employee{										//Employee class is declared with 3 fileds and a constructor initializing the fi
	int empId;
	String empName;
	String empDesig;
	employee(int eid,String eName, String eDesig){
		empId = eid;
		empName = eName;
		empDesig = eDesig;
	}
	void NetSalary(float Basic){					// a method for calculating salary is declared with empty body
		
	}
	void displayData(){								//Function to display detail of employee
		System.out.println("Employee Name: "+empName+"\nEmployee ID: "+empId+"\nEmployee Designation: "+empDesig);
		
	}
}
class Manager extends employee{				//Class manager extending to employee class 
	int NetSalary(int Basic){				//overriding Salary calculation function in manager class
		return (int)(Basic + Basic*.15);
	}
	Manager(int eid, String eName, String eDesig){ // initializing the detail of manager
		super(eid, eName, eDesig);
	}
}
class Trainee extends employee{				//Class Trainee extending to employee class
	int NetSalary(int Basic){				//overriding Salary calculation function in manager class	
		return (int)(Basic + Basic*.10);	
	}
	Trainee(int eid, String eName, String eDesig){ // initializing the employee detail
		super(eid, eName, eDesig);
	}
}
class mainClass{								//declaration of main class wheere two object one for manager and other for trainee is created
	public static void main(String[] args){
		System.out.print("\f");        
		Trainee objT = new Trainee(1234,"Anurag Saxena", "Trainee"); // employee detail is passed to constructor
		objT.displayData();												// Display method is called 
		System.out.println("Monthly Salary of Employee:"+objT.NetSalary(10000)); // calculated salary and printed using NetSAlary method
		for(int i=0;i<45;i++)
			System.out.print("_");
		System.out.println();
		Trainee objM = new Trainee(1230,"Sanjay Singh", "Senior Manager");
		objM.displayData();
		System.out.println("Monthly Salary of Employee:"+objM.NetSalary(20000));// calculated salary and printed using NetSAlary method
	}
}