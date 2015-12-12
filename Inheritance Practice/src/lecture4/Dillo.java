package lecture4;
/* Starter file for abstract class lecture */

class Dillo extends AbsAnimal{
 
  boolean isDead;  // true if Dillo is dead, otherwise false
  
  Dillo (int length, boolean isDead) {
    super(length);
    this.isDead = isDead;
  }
    
  // determines whether this dillo's length is between 2 and 3
  public boolean isNormalSize () {
    return isLenWithin(2,3); 
  }

@Override
public boolean isDangerToPeople() {
	// TODO Auto-generated method stub
	return false;
}
}



