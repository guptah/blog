package com.panchrestinfotech.blog

class Post implements Comparable<Post>{

	static hasMany = [comments : Comment, categories : Category, tags : Tag]
	static transients = ['shortDesc']


	String title
	String content
	Date lastUpdated
	Date dateCreated
	Boolean isPublished = false

	String shortDesc(){
		if(content.length() < 300){
			content
		}else {
			content.substring(0, 300)
		}
	}

	public int compareTo(Post o){
		return dateCreated.compareTo(o.dateCreated)
	}

	SortedSet comments
	SortedSet categories
	SortedSet tags

	static constraints = {
		title (nullable: false, blank:false, length:1..50)
		content (nullable: false, blank:false)
		isPublished nullable: false
		lastUpdated nullable: true  
	}
}
