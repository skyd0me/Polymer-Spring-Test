package com.example.demo;

public class List {

	private final long id;
	private final String content;

	public List(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
