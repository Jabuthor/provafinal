package exercicio1;

public class Ex08 {
	public static void execute(Integer ii){
		char[] c = String.valueOf(ii).toCharArray();
		int j=0;
		for(char cc:c){
			int i=Integer.parseInt(String.valueOf(cc));
			if(i>j)
				j=i;
			else
				j--;
		}
		System.out.println(j);
	}
	public static void main(String[] args) {
		execute(MeuRA.ra());
	}
}
