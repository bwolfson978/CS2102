package lecture4;

public abstract class AbsAnimal implements IAnimal{
	
	int length;
	
	AbsAnimal(int length){
		this.length=length;
	}
	
	public boolean isLenWithin(int low, int high){
		return low<=this.length && this.length<=high;
	}
}
