package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListInternalMechanism {

	public static void main(String[] args) {

		//The moment you write the line:
		ArrayList arl = new ArrayList(); 
		
        //The JVM creates the 10 virtual segments i.e.
		//default capacity --> 10 virtual segments 
		//virtual capacity (vc) = 10
		//physical capacity (pc) = 0 
		//(pc=0 --> because initially we didn't add anything in the Array)
		//pc --> (actual) size of the array
		
		arl.add(100);//vc=9; pc=1 
		//(pc is size of the Array i.e. ar.size()=1)
		arl.add(200);//vc=8; pc=2; pc=size=2
		
		//if we keep adding the data and 
		//if we fill all 10 segments then,
		//now, the moment we add one more data, after filling first 10
		//segment, the Java will try to add some more virtual segments 
		//but question is how many virtual segment Java will add?
		//formula for adding number of virtual segments now onwards is:
		//Load Factor for generating vc is --> pc/2
		//e.g. as soon as we filled first 10 vc then vc becomes 0 and pc 
		//becomes 10, at that point new number of virtual segments (LF) is
		//equal to pc/2 i.e. 10/2 = 5; so, now vc = 5 and pc =10
		//next time when these 5 get filled then pc becomes 15
		//no. of vc created i.e. LF = 15/2 =7.5 --> 7
		//now after filling newly created 7 segments pc = 22
		//and load factor i.e. LF = 22/1 = 11
		
		//
		//but if I want to control the number of initial virtual capacity
		//so how to do that
		//we can do this by passing the desired number of vc in the
		//constructor's parenthesis i.e. 
		ArrayList arl1 = new ArrayList(5);
		//then current and initial vc = 5; i.e 0 to 4 segments i.e. 5 
		//and pc=0
		//once we fill all 5 virtual segments vc becomes 0 and pc becomes
		//5 and then LF = 5/2 = 2.5 and new vc =2
	}

}
