
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Role {

    /**
     * Default constructor
     */
    public Role() {
    }

    /**
     * 
     */
    private Employee emp;

    /**
     * 
     */
    private CourseExecution courseExec;

    /**
     * 
     */
    private String role;

    /**
     * @param emp 
     * @param courseExec 
     * @param role
     */
    public Role(Employee emp, CourseExecution courseExec, String role) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Employee getEmp() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public CourseExecution getCourseExec() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getRole() {
        // TODO implement here
        return "";
    }

}