package engine.action.impl.condition.api;

import engine.action.api.AbstractAction;
import engine.action.api.Action;
import engine.action.api.ActionType;
import engine.action.impl.condition.impl.Condition;
import engine.definition.entity.EntityDefinition;
import engine.execution.context.Context;

import java.util.ArrayList;

public abstract class ConditionAction extends AbstractAction {

    Condition condition;
    ArrayList<Action> thenActions;
    ArrayList<Action> elseActions;

    public ConditionAction(EntityDefinition entityDefinition, ArrayList<Action> thenActions, ArrayList<Action> elseActions) {
        super(ActionType.CONDITION, entityDefinition);
        this.elseActions = elseActions;
        this.thenActions = thenActions;
    }

    public ArrayList<Action> getThenActions() {
        return thenActions;
    }

    public ArrayList<Action> getElseActions() {
        return elseActions;
    }

    public void setElseActions(ArrayList<Action> elseActions) {
        this.elseActions = elseActions;
    }

    public void setThenActions(ArrayList<Action> thenActions) {
        this.thenActions = thenActions;
    }

}
