package com.panchrestinfotech.blog

class Comment implements Comparable{
    
    static belongsTo = Post
    
    Post post
    String comment
    Commentator commentedBy = new Commentator()
    Date dateCreated
    
    public int compareTo(Object o){
        return dateCreated.compareTo(o.dateCreated)
    }
    
    static constraints = {
    }
}
