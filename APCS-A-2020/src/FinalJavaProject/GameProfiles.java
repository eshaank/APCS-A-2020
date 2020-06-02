package FinalJavaProject;

public class GameProfiles {
	private String gameName;
	private int highScore;
	private String company;
	private String genre;
	private double rating;
	private String platform;

	public GameProfiles(String game, int highscore, String companyName, String genre, double rating, String platform) {
		setGameName(game);
		setHighScore(highscore);
		setCompany(companyName);
		setGenre(genre);
		setRating(rating);
		setPlatform(platform);
	}

	public void setGameName(String name) {
		gameName = name;
	}

	String getName() {
		return gameName;
	}

	public void setHighScore(int score) {
		highScore = score;
	}

	int getHighScore() {
		return highScore;
	}

	public void setCompany(String companyName) {
		company = companyName;
	}

	String getCompany() {
		return company;
	}

	public void setGenre(String type) {
		genre = type;
	}

	String getGenre() {
		return genre;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	double getRating() {
		return rating;
	}

	public void setPlatform(String platformType) {
		platform = platformType;
	}

	String getPlatform() {
		return platform;
	}

}
