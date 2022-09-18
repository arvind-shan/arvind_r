package heri.org;

public class companyDetails extends clientDetails {
	public void companyId() {
		System.out.println("companyId is 456");

	}
	public void companyName() {
	 System.out.println("companyName is renault");
	 

	}
	public static void main(String[] args) {
		companyDetails a=new companyDetails();
		a.companyId();
		a.companyName();
		a.clientId();
		a.clientName();
		a.empId();
		a.empName();
		
	}

}
