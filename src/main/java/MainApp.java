import com.hibernate.dao.InstructorDao;
import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class MainApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com");

        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
        // associate the objects
        instructorDetail.setInstructor(instructor);
        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        // when you get instructorDetail then hibernate also saves instructor info
        InstructorDao instructorDao = new InstructorDao();
       
        instructorDao.updateInstructor(instructor);
        Instructor instructor2 = instructorDao.getInstructor(1);
//        instructor2.setId(instructor2.getId());
//        InstructorDetail instructorDetail2 = instructor2.getInstructorDetail();
//        instructor2.setFirstName("Madhan Chiluka");
//        instructor2.setInstructorDetail(instructorDetail2);
        instructorDao.updateInstructor(instructor2);
        
    }
}