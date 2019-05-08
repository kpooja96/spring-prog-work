package com.capgemini.moviecatalogue.entity;

public class MovieCatalog {

	private String movieName;
	private String movieDescription;
	private String movieRating;

	public MovieCatalog() {
		super();
	}

	public MovieCatalog(String movieName, String movieDescription, String movieRating) {
		super();
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.movieRating = movieRating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

}
