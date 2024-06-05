public class PHDStudent extends BITSStudent{
    String guide;
    String topic;
    double graduationCGPA;
    double schoolFinalPercentage;
    double postGradCGPA;
    public void setQualification(String q){
        String[] qArr = Global.getCGPAs(q);
        this.schoolFinalPercentage = Double.parseDouble(qArr[0]);
        this.graduationCGPA = Double.parseDouble(qArr[1]);
        if(!qArr[2].equals("")){
            this.postGradCGPA
        }
    }
    
    
    
    
    public PHDStudent(String name, String ID, String major, String sfP, String stipend){
        super.name = name;
        super.ID = ID;
        super.email = "f"+ID+"@hyderabad.bits-pilani.ac.in";
        setScholarship(stipend);;
        setQualification(sfP);
    }
}