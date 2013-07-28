package com.panchrestinfotech.blog

class Commentator {
    
    String name
    String url
    String email
    Comment comment
    
    static belongsTo = Comment 
    
    static constraints = {
    }
}
