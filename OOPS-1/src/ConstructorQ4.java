import java.util.Arrays;

class Subject{
    private String SubID;
    private String Name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String SubID, String Name, int maxMarks){
        this.SubID = SubID;
        this.Name = Name;
        this.maxMarks = maxMarks;
    }


    public String getSubID(){
        return SubID;
    }
    public String getName(){
        return Name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }

    public void setMaxMarks(int mm){
        maxMarks = mm;
    }
    public void setMarksObtain(int mb){
        marksObtain = mb;
    }

}

public class ConstructorQ4 {
    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);

        for(Subject s:subs)
            System.out.println(s);
    }
}
