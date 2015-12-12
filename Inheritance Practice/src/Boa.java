

class Boa extends AbsAnimal{
	  String name;
	  String eats;   // name of food that the boa consumes
	  
	  Boa (int length,String name, String eats) {
	    super(length);
	    this.eats = eats;
	  }
	  
	  // determines whether this boa's length is between 5 and 10
	  public boolean isNormalSize () {
	    return isLenWithin(5,10) ; 
	  }

	@Override
	public boolean isDangerToPeople() {
		if(this.eats=="people")return true;
		else return false;
	}
	}
