package by.academy.lesson20.classwork;

public class NewThread extends Thread {

	private StringBuilder sb;

	public NewThread(StringBuilder sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 3; i++) {
				System.out.println(sb.charAt(0));
			}
			char c = sb.charAt(0);
			sb.setCharAt(0, ++c);
		}
	}
}