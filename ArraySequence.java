import java.util.NoSuchElementException;
import java.util.ArrayList;

public class ArraySequence implements IntegerSequence {
	int currentIndex;
	int[] data;

	//public ArraySequence(int[] other) {
		//data = other.clone();
	//}

	//public ArraySequence(IntegerSequence otherseq){	}

	public void reset() {
		currentIndex = 0;
	}

	
}
