package lesson_8.pc.components;

public class PCCase {
    private String caseName;
    private int caseSize;
    private String caseColor;

    public PCCase(String caseName, int caseSize, String caseColor){
        this.caseName = caseName;
        this.caseSize = caseSize;
        this.caseColor = caseColor;
    }

    @Override
    public String toString() {
        return "Case data: \n" +
                "caseName='" + caseName + '\'' +
                ", caseSize=" + caseSize +
                ", caseColor='" + caseColor + '\'';
    }
}
