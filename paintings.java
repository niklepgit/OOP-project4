public class paintings extends masterpiece{
	private final int length;
	private final int width;
	private final String technique;

	/*constructors*/
	public paintings(int Index,String Creator,int Year,String Movement,String Condition,int Length,int Width,String Technique){
		super(Index,Creator,Year,Movement,Condition);
		length=Length;
		width=Width;
		technique=Technique;
	
		System.out.println("Creating an instance of <class> paintings.");			     	
	}

	/*getInfo*/
	public void getInfo(){
		super.getInfo();
		//cout<<"The length is "<<length<<",the width is "<<width<<" and the technique is "<<technique<<"."<<endl;
		//cout<<"The surface of this painting is "<<width*length<<"."<<endl;
		System.out.printf("The length is %d, the width is %d, and the technique is %s.\n",length,width,technique);
		System.out.printf("The surface of the painting is %d.\n",width*length);

	}	

	/*evaluate*/
	public int evaluate(String Movement,String Condition){
		String excellentCondition="excellent";
		if(!Movement.equals(getMovement())) 
			return 0;
		if(Condition.equals("good") && excellentCondition.equals(getCondition()))
			return 1;
		if(Condition.equals(getCondition()))
			return 1;
		else 
			return 0;
	}

	/*evaluate*/
	public int evaluate(String Movement){
		String Condition="good";
		String excellentCondition="excellent";
		if(!Movement.equals(getMovement())) 
			return 0;
		if(excellentCondition.equals(getCondition()))
			return 1;
		if(Condition.equals(getCondition()))
			return 1;
		else 
			return 0;
	}
	
}