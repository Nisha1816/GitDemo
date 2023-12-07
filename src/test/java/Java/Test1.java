package Java;

//package Inheritance.java.pckg;

public class Test1 extends Base{

	int intsubclass;
	String strsubclass;
	
	public void initializevalue(int i, String str) {
		intsubclass =i;
		strsubclass = str;
	}
	
	public void display() {
		System.out.println("Inter value of sub class " +intsubclass);
		System.out.println("String value of sub class " +strsubclass);
	}
	public static void main(String[] args) {
		
     Simple_Base_Class base_r_o = new Simple_Base_Class();
     base_r_o.initializevalue(10, "Vipul");
     base_r_o.display();
     base_r_o.updatethedata();
     base_r_o.display();
     
     
     System.out.println("");
     
     Simple_Base_Class base_r_sub_o = new Simple_Sub_Class();
     base_r_sub_o.initializevalue(15, "Patel");
     base_r_sub_o.display();
     base_r_sub_o.updatethedata( );
     base_r_sub_o.display();
     
     System.out.println("");
     
     Simple_Sub_Class sub_r_o = new Simple_Sub_Class();
     sub_r_o.initializevalue(20, "VP");
     sub_r_o.display();
     sub_r_o.updatethedata();
     sub_r_o.display();
     
     //Not allow , Remove the comment to see the compilation error.
    // Simple_Sub_Class sub_r_base_o = new Simple_Base_Class();

	}



}
