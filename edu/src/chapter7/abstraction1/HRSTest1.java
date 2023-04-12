package chapter7.abstraction1;

abstract class Employee {
	   String name;
	   int salary;
	   
	   //Salary & Bonus 계산하는 매소드
	   public abstract void calcSalary();

	   public abstract void calcBonus(); 
	   
	   //함수로 하는 방법
	   public void abc(String name, int salary) {
		   this.name = name;
		   this.salary = salary;
		   
		   System.out.println(name + ":" + salary);
	   }
	}

	class Salesman extends Employee {
	   public void calcSalary() {
	      System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	   }

	   public void calcBonus() {
	      System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	   }
	}

	class Consultant extends Employee {
	   public void calcSalary() {
	      System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	   }

	   public void calcBonus() {
	      System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	   }
	}

	abstract class Manager extends Employee {
	   public void calcSalary() {
	      System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	   }

	}

	class Director extends Manager { //Manager에서 상속 받기 때문에 calSalary사용 가능하고 calcBonus도 따로 만들었기 때매 일반 클라스가 된다
	   public void calcBonus() {
	      System.out.println("Director 보너스 = 기본급 * 12 * 6");
	   }
	}

	public class HRSTest1 {
	   public static void main(String[] args) {
	      Salesman s = new Salesman();
	      Consultant c = new Consultant();
	      Director d = new Director();
	     
	         
	      s.calcSalary();
	      c.calcSalary();
	      d.calcSalary();
	   }
	}