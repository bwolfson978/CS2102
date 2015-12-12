/**
 * LCSKey is a class designed to serve as a key in key-value pairs for
 * any implementation using K,V pairs. The class makes an LCSKey out of 
 * two integers and also overrides the equals and hashCode methods accordingly 
 * @author Barrett Wolfson, Erik Sola
 *
 */
public class LCSKey {
private int index1;
private int index2;

/**
 * Constructs an LCSKey
 * @param index1 the first index
 * @param index2 the second index
 */
LCSKey(int index1, int index2){
	this.index1 = index1;
	this.index2 = index2;
}

/**
 * @return index1 the first index
 */
public int getIndex1(){
	return index1;
}

/**
 * @return index2 the second index
 */
public int getIndex2(){
	return index2;
}

/**
 * @return whether a given LCSKey is equal to this one
 */
public boolean equals(Object o){
	if (!(o instanceof LCSKey))
	return false;
	else
	{
		LCSKey k = (LCSKey)o;
	return(k.index1 == this.index1 && k.index2 == this.index2);
	}
}

/**
 * @return an integer value for the the bucket number for an LCSKey
 */
public int hashCode(){
	return (41 * (41 + getIndex1()) + getIndex2());
}
}
