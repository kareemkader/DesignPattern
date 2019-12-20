package Chapter3;
enum CupSize{
	SMALL,MEDUIM,LARGE,LOW;
	public String toString(){
		switch(this){
			case SMALL:
				return "small";
			case MEDUIM:
				return "meduim";
			case LARGE:
				return "large";
			default:
			return "not avaliable";
		}
	}
}
