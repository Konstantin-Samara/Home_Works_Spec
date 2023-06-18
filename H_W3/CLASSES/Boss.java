package CLASSES;

public class Boss extends Worker{
    String education;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString()+" Образование : "+education;
    }
}
