package lesson_7;

public class MyPC {
    // PC blueprint
    // Access modifiers

    // If no access modifier provided -> by default = default (package-private) - accessible to everyone in the package
    // public - everyone
    // protected - package, inherited
    // private only the class
    private String caseName;
    private String motherBoardName;
    private String cpuModel;
    private String vgaModel;
    private int ssdSize;
    private int ramSize;

    // With all basic attributes
    MyPC(String caseName, String motherBoardName, String cpuModel, String vgaModel, int ssdSize, int ramSize){
        this.caseName = caseName;
        this.motherBoardName = motherBoardName;
        this.cpuModel = cpuModel;
        this.vgaModel = vgaModel;
        this.ssdSize = ssdSize;
        this.ramSize = ramSize;
    }

    // GET
    String getCaseName(){
        return this.caseName;
    }

    // SET
    void setCaseName(String caseName){
        this.caseName = caseName;
    }

    void getFullInformation(){
        System.out.println("PC case name: " + this.caseName);
        System.out.println("PC motherboard name: " + this.motherBoardName);
        System.out.println("PC cpu name: " + this.cpuModel);
        System.out.println("PC GVA name: " + this.vgaModel);
        System.out.println("PC SSD size: " + this.ssdSize + "T");
        System.out.println("PC RAM size: " + this.ramSize + "GB");
    }
}
