package com.panchrestinfotech.blog


class Comment implements Comparable<Comment>{

	static belongsTo = Post
	static hasMany = [comments : Comment]

	Post post
	String comment
	Commentator commentedBy = new Commentator()
	Date dateCreated
	SortedSet<Comment> comments

	public int compareTo(Comment o){
		return dateCreated.compareTo(o.dateCreated)
	}

	static constraints = {
	}
}
