package by.academy.lesson9.classwork;

public class User {
	private String login;
	private String passpord;
	static class Query {
		User u;
		public Query() {
			super();
		}
		public Query(User u) {
			this.u=u;
		}
		public void printToLog() {
			System.out.println("Пользователь" + u.login + "отправил запрос");
		}
	}

	public void createQuery() {
		Query q = new Query();
		q.printToLog();
	}
}
