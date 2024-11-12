package Practice1;

public class UnCheckedException {

		public static void main(String[] args) {
			int x[];
			try {
				x = new int[] { 1, 2, 3, 4 };
				System.out.println(x[5]);// out of bound
				System.out.println("hello");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Specified index does not exist. " + e.getMessage());// to get the detail message of																				// exception as a string value.

			}
		}
	}

