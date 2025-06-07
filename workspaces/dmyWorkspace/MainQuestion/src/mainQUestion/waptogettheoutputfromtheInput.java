package mainQUestion;

//Input="I Love Java"Add commentMore actions
//output="Java Love I"

public class waptogettheoutputfromtheInput {
	public static void main(String[] args) {
		String input ="I Love java";
		String []inp=input.split(" ");
		int i=inp.length-1;
		while(i>=0) {
			System.out.print(inp[i] +" ");
			i--;
		}
	}

}
