package Deal;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
	protected String name;
	protected String email;
	protected double money;
	public String dateOfBirth;
	protected String phone;

	public User() {
		super();
	}

	public User(String name, String email, double money, String dateOfBirth, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void dateOfBirth() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите дату вашего рождения:");
		String dateOfBirth = scan.nextLine();
		if (Pattern.matches("\\d{2}(/|-)\\d{2}(/|-)\\d{4}", dateOfBirth)) {
			System.out.println("Обязательно вас поздравим;)!");
		} else {
			System.out.println("Неверный формат");
		}

		scan.close();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", money=");
		builder.append(money);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", phone=");
		builder.append(phone);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, email, money, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& Double.doubleToLongBits(money) == Double.doubleToLongBits(other.money)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

}
