package Main;

public class AppendixA {
	int A;

	public String FlowA(int A) {
	if (A > 2000) {
		System.out.println("A");
		if (A > 6000) {
			return "C";
		} else {
			System.out.println("B");
		}
		    if (A > 4000) {
		    	return "D";
		    } else {
		    	return "E";
		    }
    } else {
    	System.out.println("1");
    }
    	if (A > 100) {
    		System.out.println("3");
    		if (A > 600) {
    			return "5";
    		} else {
    			System.out.println("4");
    			if (A > 500) {
    				return "6";
    			} else {
    				return "7";
    			}
    		}
    	} else {
    		return "2";    		
    }
    }
}


