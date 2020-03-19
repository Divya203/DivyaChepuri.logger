package com.divya.logger.task1;

class CompoundInterest extends CalculateInterests{
	CompoundInterest(Double principleAmount,Integer timeInterval,Double rateOfInterest){
		super(principleAmount,timeInterval,rateOfInterest);
	}
         Float calculateInterest() {
        	 return (float) (principleAmount * Math.pow(( 1 + rateOfInterest/100 ), timeInterval ));
         }

}
