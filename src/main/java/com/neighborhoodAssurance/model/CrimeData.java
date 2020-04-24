package com.neighborhoodAssurance.model;

public class CrimeData {
	private WSClientCrimeDataResponse[] results;
	private Pagination pagination;

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public WSClientCrimeDataResponse[] getResults() {
		return results;
	}

	public void setResults(WSClientCrimeDataResponse[] results) {
		this.results = results;
	}
	

}
