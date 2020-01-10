package models;

import exeptions.ArgumentExeption;
import exeptions.DuplicateModelException;
import helpers.Validator;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    private int distance;
    private int currentSpeed;
    private boolean allowMotorboats;
    private Set<Boat> participans;

    public Race(int distance, int currentSpeed, boolean allowMotorboats) throws ArgumentExeption {
        this.setDistance(distance);
        this.currentSpeed = currentSpeed;
        this.allowMotorboats = allowMotorboats;
        this.participans = new LinkedHashSet<>();
    }

    public void setDistance(int distance) throws ArgumentExeption {
        if(Validator.validateParam(distance)){
            this.distance = distance;
        }else{
            throw new ArgumentExeption("Distance must be a positive integer.");
        }
    }
    public void addParticipant(Boat boat) throws DuplicateModelException {
        if(!this.participans.add(boat)){
            throw new DuplicateModelException();
        }

    }
    public Set<Boat> getParticipans(){
        return this.participans;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void startRace(){
       this.participans= this.participans.stream()
                .sorted((f,s)->Double.compare(s.calcSpeed(this)
                        ,f.calcSpeed(this)))
               .collect(Collectors.toCollection(LinkedHashSet ::new));
    }
}
