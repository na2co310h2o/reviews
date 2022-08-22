package com.ut.reviews.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8856020995968150106L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="post_id")
	private int postId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="game_id")
	private int gameId;
	
	@Column(name="content")
	private String content;
	
	@Column(name="post_datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date postDateTime;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostDateTime() {
		return postDateTime;
	}

	public void setPostDateTime(Date postDateTime) {
		this.postDateTime = postDateTime;
	}
}
