package MVC;

public class Main {
    public static void main(String[] args) {
 
        //fetch student record based on his roll no from the database
        Model model  = retriveCourseFromDatabase();

        //Create a view : to write course details on console
        View view = new View();

        Controller controller = new Controller(model, view);

        controller.updateView();

        //update model data
        controller.setCourseName("Python");
        System.out.println("nAfter updating, Course Details are as follows");
        controller.setCourseCategory("category");

        controller.updateView();
     }

     private static Model retriveCourseFromDatabase(){
        Model course = new Model();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }    
}
