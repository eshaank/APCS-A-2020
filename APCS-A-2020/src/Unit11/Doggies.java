package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies {
	private Dog[] pups;

	public Doggies(int size) {
		// point pups at a new array of Dog
		pups = new Dog[size];

	}

	public void set(int spot, int age, String name) {
		// put a new Dog in the array at spot
		// make sure spot is in bounds
		if (spot <= pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest() {
		 Dog temp;
		    for (int i = 0; i < pups.length-1; i++)
		    {
		        if(pups[i].getAge() > pups[i+1].getAge())
		        {
		            temp=pups[i];
		            pups[i]=pups[i+1];
		            pups[i+1]=temp;
		            i=-1;
		        }
		    }
		
		return pups[pups.length - 1].getName();
	}

	public String getNameOfYoungest() {
		Dog temp;
	    for (int i = 0; i < pups.length-1; i++)
	    {
	        if(pups[i].getAge() > pups[i+1].getAge())
	        {
	            temp=pups[i];
	            pups[i]=pups[i+1];
	            pups[i+1]=temp;
	            i=-1;
	        }
	    }
	
	return pups[0].getName();
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}