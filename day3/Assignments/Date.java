
class Date {
	String dd, mm, yy;
	public Date(String dd, String mm, String yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	void displayDate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	void checkDate(String dd, String mm, String yy) {
		if(this.dd==dd && this.mm==mm && this.yy==yy) {
			System.out.println("Same date");
		}
		else 
			System.out.println("different date");
		
	}
}

class Main {
	public static void main(String[] args) {
		Date obj = new Date("01", "01", "2001");
		obj.displayDate();
		obj.checkDate("01","01","2001");

	}

}
