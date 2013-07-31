package com.panchrestinfotech.blog


class Category implements Comparable<Category>{

	String name
	SortedSet<Post> posts

	static hasMany = [posts : Post]
	static belongsTo = Post

	static constraints = {
		name (blank:false, unique:true, minSize:3, maxSize: 10)
	}

	public int compareTo(Category o){
		return name.compareTo(o.name)
	}

	@Override
	public String toString() {
		return name
	}
}
