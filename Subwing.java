class subwing {
	    private double price;
	     // Getter and setter methods for price
                   public double getPrice() {
	           return price;
                 }
                     public void setPrice(double price) {       
			     this.price = price;
		}

		// Overloaded method for price;
		public double getPrice(int quantity){
		// Calculate price based on quantity
		      return price * quantity;
			
		       public class Main {
                   public static void main(String[] args) {
			   // Create an instance of SubDepartment
                               SubDepartment subDepartment = new SubDepartment();
                                 subDepartment.setSize(50);
	                         Department departmentRef = subDepartment; 
			   
			   // Reference of abstract type pointing to a subclass object
                                 System.out.println("Department Size: " + departmentRef.getDepartmentSize())


		           // instace creation
		                subwing subwing = new subwing();
                                   subwing.setPrice(10.0);

		   }
		       }
