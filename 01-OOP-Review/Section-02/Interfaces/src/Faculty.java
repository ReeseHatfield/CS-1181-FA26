public class Faculty implements Commuter, Teacher {

    private String name;
    public Faculty(String name){
        this.name = name;
    }

    @Override
    public void driveToCampus() {
        System.out.println(this.name + " drives to campus");
    }

    @Override
    public void teachClass(String classname) {
        System.out.println("Teaches" + classname);
    }

    @Override
    public void gradePapers() {
        System.out.println("Grades papers");
    }
    

}
