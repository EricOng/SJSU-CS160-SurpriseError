/*
 * This is a bean for a single class search result 
 */

package Bean;

/**
 *
 * @author Eileen
 */
public class ResultBean {
    private String classId;
    private String className;
    private String statsId;
    private String provider;
    private String cost;
    private String rating;
    
    public ResultBean(){
        
    }
    
    // Setter
    public void setClassId(String classId){
        this.classId = classId;
    }
    
    
    
    //Getter
    public String getClassId(){
        return classId;
    }
    public String getClassName(){
        return className;
    }
}
