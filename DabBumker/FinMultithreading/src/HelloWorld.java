import java.util.concurrent.TimeUnit;

public class HelloWorld {

	public static class worldMap extends Thread {
		String country;

		public worldMap(String country) {
			super(country + " : Thread.");
			this.country = country;
		}

		@Override
		public void run() {
			System.err.println("Hi I am from : " + country);
		}
	}

	public static void main(String[] args) {

		String[] countryList = { "USA", "UK", "Brasil", "China", "Singapoer", "Thiland" };

		for (String country : countryList) {
			new Thread(new worldMap(country)).start();
		}
	}

}
