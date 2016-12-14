package studio4;

import java.util.Date;



public class Post extends Entity{
	
	private String body;
	private String initBody;
	private String title;
	private String initTitle;
	private String author;
	private final Date created;
	private Date modified;
	
	public Post(String body, String title, String author){
		super();
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = new Date();
		
		this.initBody = body; //variables to compare current body/title to determine if modified
		this.initTitle = title;
		
	}
	
	public final Date getCreated(){
		return this.created;
	}
	
	public String getBody(){
		return this.body;
	}
	
	public void setBody(String body){
		this.body = body;
		setModified();
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
		setModified();
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public Date getModified(){
		return this.modified;
	}
	
	public void setModified(){
		if(this.initBody != this.body || this.initTitle != this.title){
			this.modified = new Date();
		}
		this.initBody = this.body; //resets the compare variables for future changes to title or body
		this.initTitle = this.title;
	}
	
	public static void main(String[] args) {
		
		Post p = new Post("aaaaa", "first post", "nick");
		System.out.println(p.getAuthor());
		System.out.println(p.getBody());
		System.out.println(p.getTitle());
		System.out.println(p.getCreated());
//		System.out.println(p.getModified());
		p.setBody("aaa");
		System.out.println(p.getModified());
//		p.setBody("aa");
//		System.out.println(p.getModified());

	}

}
