package core;

import interfaces.Engine;
import interfaces.LieutenantGeneral;
import interfaces.Private;
import utils.reader.InputReader;

import java.util.Scanner;

public class EngineImpl implements Engine {
    public static final String END_LINE="End";
    private InputReader reader;
    public EngineImpl(InputReader reader){
        this.reader=reader;
    }
    @Override
    public void run() {

        String line=reader.readLine();
        while (line.equals(END_LINE)){
            String[] tokens=line.split("\\s+");
            String type=tokens[0];
            int id=Integer.parseInt(tokens[1]);
            String firstName=tokens[2];
            String lastName=tokens[3];
            switch (type){
                case "Private":

                    break;
                case "LieutenantGeneral":
                    new LieutenantGeneral(id,firstName,lastName,)
                    break;
                case "Engineer":
                    new EngineImpl()
                    break;
                case "Commando":
                    break;
                case "Spy":
                    break;
                default:throw new IllegalArgumentException("Invalid unit type!");
            }

            line=reader.readLine();
        }


    }
}
