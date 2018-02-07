public class sculptures extends masterpiece{
	private int volume;
	private String material;

	/*constructor*/
	public sculptures(int Index,String Creator,int Year,String Movement,String Condition,int Volume,String Material){
		super(Index,Creator,Year,Movement,Condition);
		volume=Volume;
		material=Material;
		//cout<<"Creating an instance of <class> sculptures."<<endl;				
		System.out.println("Creating an instance of <class> sculptures.");
	}		  
														
	/*getInfo*/
	public void getInfo(){
		super.getInfo();
		//cout<<"The material is "<<material<<" and the volume is "<<volume<<"."<<endl;
		System.out.printf("The material is %s and the volume is %d.\n",material,volume);
	}

		/*evaluate*/
	public int evaluate(String Movement,String Condition){
		if(!Movement.equals(getMovement()))
			return 0;
		if(Condition.equals(getCondition()))
			return 1;
		else 
			return 0;
	}

	/*evaluate*/
	public int evaluate(String Movement){
		String Condition="excellent";
		if(!Movement.equals(getMovement())) 
			return 0;
		if(Condition.equals(getCondition()))
			return 1;
		else 
			return 0;
	}

	/*or evaluate
	public int evaluate(String Movement){
		evaluate(Movement,"excellent");
	}
	*/
}