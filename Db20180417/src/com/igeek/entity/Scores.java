package com.igeek.entity;

public class Scores {
	    private int id;
	    private String sid;
	    private String subjects;
	    private String score;
	    public Scores(){
	    	
	    }
	    
		public Scores(int id, String sid, String subjects, String score) {
			super();
			this.id = id;
			this.sid = sid;
			this.subjects = subjects;
			this.score = score;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		public String getSubjects() {
			return subjects;
		}
		public void setSubjects(String subjects) {
			this.subjects = subjects;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
	   

	    
	    
	    
	    
	    
}