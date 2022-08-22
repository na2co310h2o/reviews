package com.ut.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ut.reviews.model.Comments;
import com.ut.reviews.repository.CommentsRepository;

@RestController
@RequestMapping("reviews/rest") // http://localhost:8090
public class CommentsController {

	@Autowired
	private CommentsRepository CmtRepo;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Comments>> getAllComments() {
		
		List<Comments> allComments = CmtRepo.findAll();
		
		return new ResponseEntity<List<Comments>>(allComments,HttpStatus.OK);
	}
	
	@GetMapping("/postId={pid}")
	public ResponseEntity<Comments> getpostId(@PathVariable int pid) {
		
		Comments commentPostId = CmtRepo.findByPostId(pid);
		
		return new ResponseEntity<Comments>(commentPostId,HttpStatus.OK);
	}
	
	@GetMapping("/gameId={gid}")
	public ResponseEntity<List<Comments>> getGameId(@PathVariable int gid) {
		
		List<Comments> commentGameId = CmtRepo.findByGameId(gid);
		
		return new ResponseEntity<List<Comments>>(commentGameId,HttpStatus.OK);
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<Comments> createPost(@RequestBody Comments post) {
		
		CmtRepo.save(post);
		
		Comments newPost = CmtRepo.findByPostId(post.getPostId());
		
		return new ResponseEntity<Comments>(newPost,HttpStatus.OK);
	}
	
	@PutMapping("/update/postId={pid}")
	public ResponseEntity<Comments> getpostId(@RequestBody Comments post, @PathVariable("pid") int pid) {
		
		post.setPostId(pid);
		
		CmtRepo.save(post);

		Comments updatedPost = CmtRepo.findByPostId(post.getPostId());
		
		return new ResponseEntity<Comments>(updatedPost,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/postId={pid}")
	public ResponseEntity<String> deletePostId(@PathVariable("pid") int pid) {
		
		CmtRepo.deleteByPostId(pid);
		
		return new ResponseEntity<String>("post deleted",HttpStatus.OK);
	}
}
