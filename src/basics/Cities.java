package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        
        //Declare and define an array(only size)
        String[] states = new String [5];
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Utah";
        System.out.println(states[0]);
        
        //Declare array
        String[] countries;
        
        //Define array
        countries = new String[3];
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "UK";
        System.out.println(countries[2]);
        
        System.out.println("****LOOPS****");
        
      //Declare and define an array(only size)
        String[] state = new String [5];
        state[0] = "California";
        state[1] = "Ohio";
        state[2] = "New Jersey";
        state[3] = "Texas";
        state[4] = "Utah";
        
        //Do Loop enters the loop THEN tests the condition
        int i = 0;
        
        do {
        	System.out.println("STATE: " + state[i]);
        	i = i+1;
        } while(i < 5);
        
        //While Loop tests condition first THEN enters the loop
        int n = 0;
        boolean stateFound = false;
        while(!stateFound) {
        	String State = state[n];
        	System.out.println(State);
        	if(State == "Texas") {
        		System.out.println("STATE FOUND!");
        		stateFound = true;
        	}
        n++; //same as n = n+1	
        }
        
        //For loop is the best structure for iterating through an array
        System.out.println("\nPRINTING WITH FOR LOOP");
        for(int x=0; x<5; x++) {
        	System.out.println(state[x]);
        }
	}

}
