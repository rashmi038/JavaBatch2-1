package rashmi;

import java.util.Scanner;

public class Employee {
	
	    int empno;
	    String name;
	    float salary, hra, da, it, gp;
	    Employee()
	    {
	        empno=0;
	        name = "";
	        salary = 0.0f;
	        hra = 0.0f;
	        da = 0.0f;
	        it = 0.0f;
	        gp = 0.0f;
	    }
	    void unit()
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter Employee number=");
	        empno = sc.nextInt();
	        System.out.print("Enter name=");
	        name = sc.next();
	        System.out.print("Enter salary=");
	        salary = sc.nextFloat();
	    }
	    void calc()
	    {
	        hra = salary * 0.1f;
	        da = salary * 0.555f;
	        it = salary * 0.06f;
	        gp = salary + hra + da - it ;
	        
	    }
	    void display()
	    {
	        System.out.println("Salary Slip\n");
	        System.out.println("Employee number="+empno);
	        System.out.println("Name="+name);
	        System.out.println("Basic pay="+salary);        
	        System.out.println("Housing Rent Allowance="+hra);    
	        System.out.println("Dearness Allowance="+da);
	        System.out.println("Income Tax="+it);
	        System.out.println("Grass pay="+gp);
	    }
	   
	}

