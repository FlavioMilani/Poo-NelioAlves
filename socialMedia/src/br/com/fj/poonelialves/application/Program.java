package br.com.fj.poonelialves.application;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.fj.poonelialves.entities.Comment;
import br.com.fj.poonelialves.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
		
		
		/*
		 * LocalDateTime date = LocalDateTime.now(); Instant instant =
		 * date.atZone(ZoneId.systemDefault()).toInstant();
		 */
		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome!!");
		
		Post fPost = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to new Zealand", 
				"I'm going to visit this wonderful country", 12);
		
		fPost.addComment(comment1);
		fPost.addComment(comment2);
		
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the Force be with you");
		
		Post sPost = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", 
				"See you tomorrow", 5);
		
		
		sPost.addComment(comment3);
		sPost.addComment(comment4);
		
		
		
		System.out.println(fPost);
		System.out.println(sPost);
		
	}

}
