package com.caprusIt.entity;

import org.springframework.data.domain.Sort;

public class Paganition {

	private int PageNumber;
	private int PageSize;
	private Sort.Direction  sortDirection= Sort.Direction.ASC;
	private String SortBY;
	public int getPageNumber() {
		return PageNumber;
	}
	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public Sort.Direction getSortDirection() {
		return sortDirection;
	}
	public void setSortDirection(Sort.Direction sortDirection) {
		this.sortDirection = sortDirection;
	}
	public String getSortBY() {
		return SortBY;
	}
	public void setSortBY(String sortBY) {
		SortBY = sortBY;
	}
}