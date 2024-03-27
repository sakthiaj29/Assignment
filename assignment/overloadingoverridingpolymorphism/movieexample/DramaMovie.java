package assignment.overloadingoverridingpolymorphism.movieexample;

public class DramaMovie extends Movie {

	private String name;
	private String language;
	private String certificate;
	private double price;
	
	public DramaMovie(String name, String language,String certificate, double price) {
		this.name=name;
		this.language=language;
		this.certificate=certificate;
		this.price=price;
	}
	
	public void display() {
		System.out.println("DramaMovie name:"+name+", language:"+language+", certificate:"+certificate+", price:"+price);
	}

}
