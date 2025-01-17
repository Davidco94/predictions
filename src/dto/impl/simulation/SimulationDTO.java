package dto.impl.simulation;

import dto.api.AbstractDTO;

import java.util.ArrayList;

public class SimulationDTO extends AbstractDTO<ArrayList<SimulationReport>> {
    public SimulationDTO(boolean success, ArrayList<SimulationReport> data) {
        super(success, data);
    }
    public ArrayList<SimulationReport> getSimulations() {
        return data;
    }


}
