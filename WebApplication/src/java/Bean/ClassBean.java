/*
    This is a bean for a detailed class infomation
*/
package Bean;

/**
 *
 * @author Eileen
 */
public class ClassBean {
    private String classId;
    private String className;
    private String classCategory;
    private String statsId;
    private String source;
    private String description;
    private String cost;
    private String reviews;//should it be rating?
    
    public ClassBean(){
        
    }
    
    
    //getter
    public String getClassId(){
        return classId;
    }
}
