
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Object;

import java.util.*;

public class Course
{
    private String CourseTitle;
    
    private String CodeNumber;
    
    public Course(String CT, String CN)
    {
        CourseTitle = CT;
        
        CodeNumber = CN;
    }
    
    public String GetCT()
    {
        return CourseTitle;
    }
    
    public String GetCN()
    {
        return CodeNumber;
    }
}
