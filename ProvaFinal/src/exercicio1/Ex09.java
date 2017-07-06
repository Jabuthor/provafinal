package exercicio1;

enum Valid{
	A{
		void calcular(int i){
			System.out.println(i/2);
		}
	},
	B{
		void calcular(int i){
			System.out.println(i/3);
		}
	};
	abstract void calcular(int i);
}
public class Ex09 {
	public static void execute(Integer ii){
		int idx = ii%2;
		Valid v;
		if(idx ==0)
			v = Valid.A;
		else
			v = Valid.B;
		v.calcular(ii);
				
	}
	public static void main(String[] args) {
		execute(MeuRA.ra());
	}
}
