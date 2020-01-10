package interfaces;

import enums.Mission;

import java.util.Collection;

public interface Commando {
    public void addMission(Mission mission);
    public Collection<Mission> getMissions();

}
