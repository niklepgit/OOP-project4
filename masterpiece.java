public class masterpiece extends artifacts{
	private String movement;
	private String condition;

	/*constructor*/
	public masterpiece (int Index,String Creator,int Year,String Movement,String Condition){
		super(Index,Creator,Year);
		movement=Movement;
		condition=Condition;
	}

	/*setCondition*/
	public void setCondition(String Condition){
		condition=Condition;
	}

	/*getInfo*/
	public void getInfo(){ 	
		super.getInfo();
		//cout<<"The movement is "<<movement<<" and the condition is "<<condition<<"."<<endl;
		System.out.printf("The movement is %s and the condition is %s.\n",movement,condition);
	}

	/*getMovement*/
	public String getMovement(){
		return movement;
	}

	/*getCondition*/
	public String getCondition(){
		return condition;
	}

	/*evaluate*/
	public int evaluate(String Movement,String condition){
		return -2;
	}

	/*evaluate*/
	public int evaluate(String Movement){
		return -2;
	}

}