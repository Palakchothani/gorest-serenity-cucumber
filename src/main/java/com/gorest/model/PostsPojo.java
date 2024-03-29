package com.gorest.model;

public class PostsPojo
{
    private int id;
    private int user_id;
    private String title;
    private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static PostsPojo getRequestBody(int userId, String title, String body){
        PostsPojo postsPojo = new PostsPojo();
        postsPojo.setUser_id(userId);
        postsPojo.setTitle(title);
        postsPojo.setBody(body);
        return postsPojo;
    }
}
