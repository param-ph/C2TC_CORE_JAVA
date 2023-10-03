package dayTwo;

public class Main {

	public static void main(String[] args) {
		person person1 = new person();
		person1.name = "Param";
		person1.age = 22;
		
		person person2 = new person();
		person2.name = "Krishna";
		person2.age = 0;
		
		System.out.println("Person 1 name :"+ person1.name + "  age :"+ person1.age );
		System.out.println("Person 2 name :"+ person2.name + "  age :"+ person2.age );
		
		modifyPerson(person2);
		System.out.println("new age" + person2.age);
	}
		static void modifyPerson(person person) {
			person.age = 25;
			//System.out.println(person.age);
	}
}
