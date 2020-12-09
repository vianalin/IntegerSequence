import java.util.NoSuchElementException;
import java.util.ArrayList;

public class ArraySequence implements IntegerSequence {
	int currentIndex;
	int[] data;

	public ArraySequence(int[] other) {
		data = new int[other.length];
		for(int i = 0; i < other.length; i++) {
			data[i] = other[i];
		}
	}

	//public ArraySequence(IntegerSequence otherseq){}}

	public void reset() {
		currentIndex = 0;
	}

	public int length() {
		return data.length;
	}

	public boolean hasNext() {
		return currentIndex < data.length;
	}

	public int next() {
		if(!hasNext()) throw new NoSuchElementException();
		currentIndex++;
		return data[currentIndex - 1];
	}
}
