package tasks_6.atm_card;

public enum Operation {
    ADD("Adding "),
    WITHDRAW("Withdrawing");

    private String text;

    Operation(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
