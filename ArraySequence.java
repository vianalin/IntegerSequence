import java.util.NoSuchElementException;
import java.util.ArrayList;

public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
  	data = other.clone();
  }
}