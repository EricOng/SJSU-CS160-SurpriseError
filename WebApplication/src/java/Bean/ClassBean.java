/*
    This is a bean for a detailed class infomation
*/
package Bean;

/**
 *
 * @author Eileen
 */
public class ClassBean implements java.io.Serializable{
    private int classId;
    private String className;
    private String category;
    private String source;
    private String description;
    private double cost;
    private double rating;
    private String type;
    
    public ClassBean(){
       
    }
    //setter
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
    
    
    //getter
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
}
