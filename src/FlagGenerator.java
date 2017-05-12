
public class FlagGenerator {
	private int flag;
	
	public FlagGenerator(int n) {
			if( n == 1) {
				do {
					flag = (int)(Math.random() * 16);
				}while(flag==0 || flag== 2 || flag==4 || flag==5 || flag==7 || flag==8 || flag==9 || flag==10 || flag== 11 || flag== 12 || flag==13 || flag==14 || flag==15 );
			}
		else if(n == 2) {
			do {
				flag = (int)(Math.random() * 16);
			}while(flag==0||flag== 1||flag== 3||flag==4 ||flag==5||flag==6||flag== 11||flag== 12||flag==13 ||flag==14||flag==15 );
		}
		else  {
			do {
				flag = (int)(Math.random() * 16);
			}while(flag!=-1);
		
		}
		
	}
	
	public int getFlag() {
		return flag;
	}
	

}
