/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import java.util.ArrayList;

/**
 *
 * @author Eileen
 */
public class DetailedClassBean {
    private int classId;
    private String className;
    private String category;
    private String source;
    private String description;
    private double cost;
    private double rating;
    private String type;
    private String Prereqs;
    private String url;
    private int reviews;
    private int Provider_id;
    private String duration;
    private String avail;
     private ArrayList<ReviewBean> ReviewList = new ArrayList<ReviewBean>();
    
    public DetailedClassBean(){
       
    }
    //setter
    public void setURL(String url){
        this.url=url;
    }
    public void setClassType(String type){
        this.type = type;
    }
    public void setClassPrereqs(String prereqs){
        Prereqs = prereqs;
    }
    public void setClassReviews(int reviews){
        this.reviews = reviews;
    }
    public void setProviderId(int provider_id){
        Provider_id = provider_id;
    }
    public void setClassId(int id){
        classId = id;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public void setClassCategory(String category){
        this.category = category;
    }

    public void setSource(String source){
        this.source = source;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public void setAvailability(String avail){
        this.avail = avail;
    }
    
    //getter
    public String getAvailability(){
        return avail;
    }
    public String getDuration(){
        return duration;
    }
    public String getClassType(){
        return type;
    }
    public String getClassPrereqs(){
        return Prereqs;
    }
    public int getClassReviews(){
        return reviews;
    }
    public int getProviderId(){
        return Provider_id;
    }
    
     public int getClassId(){
        return classId;
    }
    public String getClassName(){
        return className;
    }
    public String getClassCategory(){
        return category;
    }

    public String getSource(){
        return source;
    }
    public String getDescription(){
        return description;
    }
    public double getCost(){
        return cost;
    }
    public double getRating(){
        return rating;
    }
    
    public void addToReviewList(ReviewBean c){
        ReviewList.add(c);
    }
    public ArrayList<ReviewBean> getReviewList(){
        return ReviewList;
    }
    public void reset(){
        ReviewList = new ArrayList<ReviewBean>();

    }    
}
