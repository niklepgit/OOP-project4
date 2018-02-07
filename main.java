import java.util.Random;

public class main{
	
	public static void main(String args[]){
		int i;

		int N=Integer.parseInt(args[0]); //take the number of artifacts from command line

		if(args.length==3){
			String Movement=args[1]; //take the Movement from command line
			String Condition=args[2]; //take the Condition from command line
			artifacts[] array=new artifacts[N]; //make an array of pointers to artifacts
			createArrayOfArtifacts(array); //create the array of artifacts
			System.out.println();
			auction(array,Movement,Condition); //begin the auction
		}
		else
		{
			String Movement=args[1]; //take the Movement from command line
			artifacts[] array=new artifacts[N]; //make an array of pointers to artifacts
			createArrayOfArtifacts(array); //create the array of artifacts
			auction(array,Movement); //begin the auction
		}	

	
	}

	/*auction*/
	public static void auction(artifacts[] Artifacts,String Movement,String Condition){
		int i;
		for(i=0;i<Artifacts.length;i++){ //for all of the artifacts
			Artifacts[i].getIndex(); //print the index
			Artifacts[i].getInfo(); //print the Info
			//cout<<"Evaluate:"<<Artifacts[i]->evaluate(Movement,Condition)<<endl<<endl; 
			System.out.printf("Evaluate:%d\n\n",Artifacts[i].evaluate(Movement,Condition));		
		}
	}

	/*overload auction*/
	public static void auction(artifacts[] Artifacts,String Movement){
		int i;
		for(i=0;i<Artifacts.length;i++){ //for all of the artifacts
			Artifacts[i].getIndex(); //print the index
			Artifacts[i].getInfo(); //print the Info
			//cout<<"Evaluate:"<<Artifacts[i]->evaluate(Movement,Condition)<<endl<<endl; 
			System.out.printf("Evaluate:%d\n\n",Artifacts[i].evaluate(Movement));		
		}
	}

	/*createArrayOfArtifacts*/
	public static void createArrayOfArtifacts(artifacts[] array){
		int i;
		Random random=new Random(System.currentTimeMillis());
		String num;
		String Movements[]={"impressionism", "expressionism", "naturalism"};
		String Conditions[]={"bad", "good", "excellent"};
		String Techniques[]={"oil", "aquarelle", "tempera"};
		String Materials[]={"iron", "stone", "wood"};

		int randomArtifacts=random.nextInt(array.length)+1;
		for(i=0;i<randomArtifacts;i++){
			int randCondition=random.nextInt(2-0+1)+0; //select a condition randomly
			int randMovement=random.nextInt(2-0+1)+0; //select a movement randomly
			int randTechnique=random.nextInt(2-0+1)+0; //select a technique randomly
			//make a painting dynamically
			num=Integer.toString(i);
			paintings Painting=new paintings(i,"Creator"+num,random.nextInt((2000-1600)+1)+1600,Movements[randMovement],Conditions[randCondition],random.nextInt((70-30)+1)+30,random.nextInt((70-30)+1)+30,Techniques[randTechnique]);
			array[i]=Painting; //artifacts *ptr=Painting;
		}
		for(i=randomArtifacts;i<array.length;i++){
			int randCondition=random.nextInt(2-0+1)+0; //select a condition randomly
			int randMovement=random.nextInt(2-0+1)+0; //select a movement randomly
			int randMaterial=random.nextInt(2-0+1)+0; //select a technique randomly
			//make a sculpture dynamically
			num=Integer.toString(i);
			sculptures Sculpture=new sculptures(i,"Creator"+num,random.nextInt((2000-1600)+1)+1600,Movements[randMovement],Conditions[randCondition],random.nextInt((70-30)+1)+30,Materials[randMaterial]);
			array[i]=Sculpture; //artifacts *ptr=Sculpture;
		}	
	}
}

