package com.ut.reviews.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ut.reviews.model.Comments;

@Repository
public interface CommentsRepository extends CrudRepository<Comments, Integer>{

	List<Comments> findAll();
	
	Comments findByPostId(int postId);
	
	List<Comments> findByGameId(int gameId);
	
	/*
	 * @Query("SELECT a " + "FROM Comments " +
	 * "WHERE a.postDateTime <= :postDateTime") List<Comments>
	 * findAllByPostDateTimeBefore(@Param("postDateTime") Date postDateTime);
	 */
	
	@Transactional
	int deleteByPostId(int postId);
	
}
