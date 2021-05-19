package com.cognizant.moviecruiser.model;



import org.springframework.stereotype.Component;

@Component
public class Movie {
	int id;
	String title;
	String boxOffice;
	boolean active;
	String dateOfLaunch;
	String genere;
	boolean hasTeaser;
	boolean favorite;
	
	public Movie() {
	}

	public Movie(int id, String title, String boxOffice, boolean active, String dateOfLaunch, String genere,
			boolean hasTeaser, boolean favorite) {
		super();
		this.id = id;
		this.title = title;
		this.boxOffice = boxOffice;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.genere = genere;
		this.hasTeaser = hasTeaser;
		this.favorite = favorite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(String dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public boolean isHasTeaser() {
		return hasTeaser;
	}

	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", boxOffice=" + boxOffice + ", active=" + active
				+ ", dateOfLaunch=" + dateOfLaunch + ", genere=" + genere + ", hasTeaser=" + hasTeaser + ", favorite="
				+ favorite + "]";
	}
	
	
}