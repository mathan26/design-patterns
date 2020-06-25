package com.github.mathan.design_patterns.command;

public class Invoker {

    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNo=7;

    public Invoker() {
        this.onCommands = new Command[slotNo];
        this.offCommands = new Command[slotNo];
    }

    public void setOnCommands(Command command,int slotNo){
        onCommands[slotNo]=command;
    }

    public void setOffCommands(Command command,int slotNo){
        offCommands[slotNo]=command;
    }

    public void onButtonWasPushed(int slotNo){
        onCommands[slotNo].execute();
    }

    public void offButtonWasPushed(int slotNo){
        offCommands[slotNo].execute();
    }

}
