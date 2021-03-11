// Berkeley's Comment: Kyle is an absolute KING. Thank you for doing this and the survey last minute!! ٩(◕‿◕｡)۶


package parentclassexercise;

public class Pokemon {
	public int weight;
	public String type;
	
	public Pokemon(){ //default constructor
		this.weight = 0;
		this.type = "";
		
	}
	
	
	public Pokemon(int wParameter, String tParameter) {
		this.weight = wParameter;
		this.type = tParameter;
		
		
	}
	public void canFitInPokeball() {
		System.out.println("Can Fit in Pokeball");
	
	}
	public void getWeight() {
		System.out.println(weight);
	}
	
	public void getType() {
		System.out.println(type);
	}
	public void setWeight(int wParameter) {
		this.weight = wParameter;
	}
	public void setType(String tParameter) {
		this.type = tParameter;
	}
	public void move() {
		System.out.println("cam move.");
		
	}
}


