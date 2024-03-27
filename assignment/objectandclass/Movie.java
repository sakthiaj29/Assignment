package assignment.objectandclass;

 class Movie {

	private static String theatreName="ABCD Teatre";
	private String name;
	private long id;
	private String language;
	private double price;
	private String genres;
	private String certificatesl;
	private String[] cast;
	private String director;
	private String producers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getCertificatesl() {
		return certificatesl;
	}

	public void setCertificatesl(String certificatesl) {
		this.certificatesl = certificatesl;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducers() {
		return producers;
	}

	public void setProducers(String producers) {
		this.producers = producers;
	}

	public static String getTheatreName() {
		return theatreName;
	}

	public static void setTheatreName(String theatreName) {
		Movie.theatreName = theatreName;
	}

}
