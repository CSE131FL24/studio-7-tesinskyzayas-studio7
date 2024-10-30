package studio7;
import java.util.Random;

	public class Die {
		private final int sides;
		private final Random random;
		
		public Die(int n) {
			if (n < 1) {
				throw new IllegalArgumentException("Die must have at least 1 side.");
			}
			this.sides = n;
			this.random = new Random();
		}
		public int roll() {
			return random.nextInt(sides) + 1;
		}
		public int getSides() {
			return sides;
		}
	}
