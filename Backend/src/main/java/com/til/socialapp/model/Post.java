package com.til.socialapp.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "post_DB")
public class Post {
	// empImgUrl,images,videos not used
	@Id
	private ObjectId id;
	private int empId;
	private String name;
	private int likesCount;
	private int commentsCount;
	private boolean hasLiked;
	private String createdAt;
	private String updatedAt;
	private String content;
	private String[] tags;

	// Constructor
	public Post(ObjectId id,int empId, String name, int likesCount, int commentsCount, boolean hasLiked, String createdAt,
			String updatedAt, String content, String[] tags) {
		super();
		this.id=id;
		this.empId = empId;
		this.name = name;
		this.likesCount = likesCount;
		this.commentsCount = commentsCount;
		this.hasLiked = hasLiked;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.content = content;
		this.tags = tags;
	}

	// Getters and Setters
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}

	public int getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(int commentsCount) {
		this.commentsCount = commentsCount;
	}

	public boolean isHasLiked() {
		return hasLiked;
	}

	public void setHasLiked(boolean hasLiked) {
		this.hasLiked = hasLiked;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
}
