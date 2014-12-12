/*
    This is a bean for a review infomation
*/
package Bean;

/**
 *
 * @author Eileen
 */
public class ReviewBean implements java.io.Serializable{
    private int reviewId;
    private int classId;
    private int userId;
    private String userName;
    private String time;
    private String text;

    
    public ReviewBean(){
       
    }
    //setter
    public void setReviewId(int id){
        reviewId = id;
    }
    public void setClassId(int id){
        classId = id;
    }
     public void setUserId(int id){
        userId = id;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setTime(String time){
        this.time = time;
    }
    public void setText(String text){
        this.text = text;
    }

    
    
    //getter
    public int getReviewId(){
        return reviewId;
    }
    public int getClassId(){
        return classId;
    }
    public int getUserId(){
        return userId;
    }
    public String getUserName(){
         return userName;
     }
    public String getTime(){
        return time;
    }
    public String getText(){
        return text;
    }
}
