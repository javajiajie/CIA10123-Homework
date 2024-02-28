package hw6;

public class Calculator {
	public int ans ;

	public int powerXY(int x, int y) throws CalException {
		if (x == 0 || y == 0) {
			throw new CalException("xy值不可為0");
		} else 
		if(y < 0){
			throw new CalException("y為負值,而導致x的y次方結果不為整數");
		}else{
			ans = (int) Math.pow(x, y);
			return ans;
		}
	}
}
