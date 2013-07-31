package com.panchrestinfotech.blog

class Commentator {

	String name
	String webURL
	String emailAddress
	Comment comment

	static belongsTo = Comment

	static constraints = {
		name(nullable:false, blank:false, length:3..20)
		webURL(nullable:true, blank:true, url:true)
		emailAddress(nullable:true, blank:true, email:true)
	}

	@Override
	public String toString() {
		return name
	}
}
