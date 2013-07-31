import com.panchrestinfotech.blog.Comment
import com.panchrestinfotech.blog.Commentator
import com.panchrestinfotech.blog.Post

class BootStrap {

    def init = { servletContext ->
		
		Post post1 = new Post(title:"First Grails Project", content:"The full content of the article. The full content of the article. The full content of the article.The full content of the article.The full content of the article.The full content of the article.", isPublished:false).save()
		
		Post post = new Post(title:"First Grails Project", content:"The full content of the article. The full content of the article. The full content of the article.The full content of the article.The full content of the article.The full content of the article.", isPublished:false)
		Comment comment = new Comment(comment: "awesome")
		Commentator commentator = new Commentator(name: "himanshu", emailAddress: "a@b.com");
		comment.setCommentedBy(commentator);
		comment.setPost(post);
		post.save()
		
    }
	
    def destroy = {
    }
}
