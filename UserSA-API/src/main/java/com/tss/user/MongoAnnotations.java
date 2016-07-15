package com.tss.user;

import org.springframework.data.mongodb.core.mapping.Language;
import org.springframework.data.mongodb.repository.Query;


public class MongoAnnotations {

	public static void main(String[] args) {
		
		//org.springframework.data.mongodb.repository
		/*org.springframework.data.mongodb.config.EnableMongoAuditing;*/
		/*org.springframework.data.mongodb.core.index.CompoundIndex;
		org.springframework.data.mongodb.core.index.CompoundIndexes;
		org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
		org.springframework.data.mongodb.core.index.Indexed;
		org.springframework.data.mongodb.core.index.TextIndexed;
		*/
		/*org.springframework.data.mongodb.core.mapping.Document;//only class level
		org.springframework.data.mongodb.core.mapping.DBRef;
		org.springframework.data.mongodb.core.mapping.Field;
		org.springframework.data.mongodb.core.mapping.Language;//use this annotation if you are storing language
		org.springframework.data.mongodb.core.mapping.TextScore;
		org.springframework.data.mongodb.core.mapping.Version;//use this when you are storing version of something
		*/
		/*org.springframework.data.mongodb.repository.Meta;//not applicable for field
		org.springframework.data.mongodb.repository.Near;//not applicable for field,method and class level
		org.springframework.data.mongodb.repository.Query;//not APPLICABLE FOR FIELD
		org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
		*/
		
	}
	
	@SuppressWarnings("unused")
	private String userId;
	private String userName;
	@Language
	private String userLanguage;
	@Query()
	public String test(){
		return userName;
	}
	
}
