package tutorial001;

public class Student {
	String name="john";
	int rollnum=001;
	String course="B.SC";
	public void validate() {
		if (name=="john" & rollnum==002) {
			System.out.println("Library card issuance in progress");
			
		}
		else {
			System.out.println("no record found");
		}
	}

}
