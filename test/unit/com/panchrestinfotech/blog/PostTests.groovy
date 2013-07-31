package com.panchrestinfotech.blog



import grails.test.mixin.*

import org.junit.*

import com.sun.jmx.snmp.UserAcl;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostTests {

	void testBasicCRUD() {
		Post post = new Post(title:"First Grails Project", content:"The full content of the article. The full content of the article. The full content of the article.The full content of the article.The full content of the article.The full content of the article.", isPublished:false)
		post.save()

		def id = post.id
		Post retrievedPost = Post.get(id)

		assertEquals( "First Grails Project", retrievedPost.title)
		assertEquals( "The full content of the article. The full content of the article. The full content of the article.The full content of the article.The full content of the article.The full content of the article.", retrievedPost.shortDesc())

		assertNull(Post.get(10))

		post.isPublished = true
		post.save()

		retrievedPost = Post.get(id)
		assertEquals(true, retrievedPost.isPublished)

		post.delete(flush : true)
		assertEquals(null, Post.get(id))
	}

	void testAdvanceCRUD() {
		
		Post post = new Post(title:"First Grails Project", content:"The full content of the article. The full content of the article. The full content of the article.The full content of the article.The full content of the article.The full content of the article.", isPublished:false)
		Comment comment = new Comment(comment: "awesome")
		Commentator commentator = new Commentator(name: "himanshu", emailAddress: "a@b.com");
		
		comment.setCommentedBy(commentator);
		comment.setPost(post);
		
		post.save()

		def id = post.id
		Post retrievedPost = Post.get(id)

		assertEquals( "First Grails Project", retrievedPost.title)
		assertEquals( "The full content of the article. The full content of the article. The full content of the article.The full content of the article.The full content of the article.The full content of the article.", retrievedPost.shortDesc())
		
		retrievedPost.comments.each {
			assertEquals( "awesome", ${it}.comment)
			assertEquals( "himanshu", ${it}.commentator.name)
			assertEquals( "a@b.com", ${it}.commentator.emailAddress)
		}
		
		
		assertNull(Post.get(10))

		post.isPublished = true
		post.save()

		retrievedPost = Post.get(id)
		assertEquals(true, retrievedPost.isPublished)

		post.delete(flush : true)
		assertEquals(null, Post.get(id))
	}
}

