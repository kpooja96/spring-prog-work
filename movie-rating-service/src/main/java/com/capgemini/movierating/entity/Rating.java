package com.capgemini.movierating.entity;

public class Rating {

	private int movieId;
	private double rating;
	public Rating(int movieId, double rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public Rating() {

	super();
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
