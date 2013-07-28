package com.panchrestinfotech.blog

class Post {
    
    String title
    String shortDesc
    String content
    Date lastUpdated
    Boolean isPublished = false ;
    SortedSet comments
    Set categories
    Set tags
    
    static hasMany = [comments : Comment, categories : Category, tags : Tag]
    
    static constraints = {
    }
}
