

public class Shark extends Fish {
	int length;
    double salinity;
    int attacks;
  
    Shark (int length, int attacks) {
      super(length,3.75);
      this.attacks = attacks;
    }
  
    public boolean isNormalSize () {
      return this.length>=6;
    }
    
    public boolean isDangerToPeople(){
    	if(attacks>=1)return true;
    	else return false;
    }
}
