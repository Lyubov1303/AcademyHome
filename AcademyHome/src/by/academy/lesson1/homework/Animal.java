package by.academy.lesson1.homework;

public class Animal {
		private String nickname;
		private int age;
		
		public Animal() {
			super();
					}
		public Animal(String nickname, int age) {
			super();
			this.nickname = nickname;
			this.age = age;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public static class AnimalDemo {
			public static void main (String[] arg) {
				
				System.out.println("Hi! What your name?");
				
				Animal cat1= new Animal ();
				cat1.nickname="кот Барсик";
				cat1.age=2;
			
				System.out.println(cat1.nickname +" " +cat1.age +" "+"age");
				System.out.println("Hi! What your name?");
				
				Animal cat2= new Animal ("кот Васька",3);
				System.out.println(cat2.nickname + " " +cat2.age+" " +"age");
			}
		
		}
}

		