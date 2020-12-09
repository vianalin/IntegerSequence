public class Tester3 {
	public static void main(String[] args) {
		IntegerSequence r = new Range(10,20);
		IntegerSequence as = new ArraySequence(r);

		System.out.println("ArraySequences(seq):");
		while(as.hasNext()) {
			System.out.println(as.next() + ", ");
		}
		System.out.println();
	}
}