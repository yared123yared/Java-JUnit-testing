public class Service {
    private Database database;
    public Service(Database database){
        this.database=database;
    }


    public Student addStudents(Student student){
        return  database.addStudents(student);

    }
    public int getSize(){
        return this.database.getDatabaseSize();
    }
    public boolean query(String query){
        return database.isAvailable();
    }



}

