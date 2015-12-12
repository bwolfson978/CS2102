package lecture4;

public class Fish extends AbsAnimal {
	 int length;  
	 double salinity;
	   
	     Fish (int length, double salinity) {
	       super(length);
	       this.salinity = salinity;
	     }
	   
	     public boolean isNormalSize () {
	       return isLenWithin(3,15);
	     }

		@Override
		public boolean isDangerToPeople() {
			// TODO Auto-generated method stub
			return false;
		}
}
