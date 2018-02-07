public class artifacts{
	private final int index;
	private final String creator;
	private final int year;

	/*constructor*/
	public artifacts(int Index,String Creator,int Year){							   	
		System.out.println("Creating an instance of <class> artifacts.");
		index=Index;
		creator=Creator;
		year=Year;	
	}

	/*getInfo*/
	public void getInfo(){
		//cout<<"The creator is "<<creator<<" and the year is "<<year<<"."<<endl;
		System.out.printf("The creator is %s and the year is %d.\n",creator,year);
	}

	/*getIndex*/
	public void getIndex(){
	//cout<<"The index is "<<index<<"."<<endl;
		System.out.printf("The index is %d.\n",index);
	}
	
	/*evaluate*/
	public int evaluate(String Movement,String Condition){
		return -1;
	}

	/*evaluate*/
	public int evaluate(String Movement){
		return -1;
	}

}
