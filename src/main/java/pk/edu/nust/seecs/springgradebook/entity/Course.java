package pk.edu.nust.seecs.springgradebook.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 * Returns a Course entity object that holds all students in the course 
 * <p>
 This entity class holds the general attributes of a course. 
 Contained in this class are attributes such as credithours, like its title(BSCS-3),
 and a list of all students in this course.
 */
@Entity
public class Course implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "course_id")
    private Integer courseId;
    @Column
    private String courseTitle;
    @Column
    private int creditHours;
    
    /*
    * This relationship contains the students taking this course.
    * The reverse relationship is present in the Student entity class
    */
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "course_students", joinColumns = {
        @JoinColumn(name = "course_id")}, inverseJoinColumns = {
        @JoinColumn(name = "student_id")})
    private Set<Student> students = new HashSet<>(0);
    
    /*
    * Class constructor.
    */
    public Course() {
    }
    
    /*
    * Class constructor that builds this object by taking in defined attributes
    */
    public Course(String classtitle, int creditHours) {
        this.courseTitle = classtitle;
        this.creditHours = creditHours;
    }
    /*
    * This method will return the course id of this course.
    * Note; we have not defined any setter method for course id, since it is 
    * to be generated by the dbms.
    */
    public Integer getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" + "courseid=" + courseId + ", classtitle=" + courseTitle + ", creditHours=" + creditHours + ", students=" + students + '}';
    }

}
