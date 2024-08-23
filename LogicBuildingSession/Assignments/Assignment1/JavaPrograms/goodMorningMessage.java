class goodMorningMessage{
	public static void main(String [] args){
	int time = 7;
	String period = "AM";
	
	if (time > 5 && time < 12 && period == "AM"){
		System.out.println("Good Mornign");
	}
	else {
		System.out.println("it is afternoon or evening");
	}
	
	}
}