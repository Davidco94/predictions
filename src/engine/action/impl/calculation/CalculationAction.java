package engine.action.impl.calculation;

import engine.action.api.AbstractAction;
import engine.action.api.ActionType;
import engine.definition.entity.EntityDefinition;
import engine.definition.property.api.PropertyType;
import engine.execution.context.Context;
import engine.execution.expression.impl.ExpressionCalculator;

public class CalculationAction extends AbstractAction {

    private final String resultProp;
    private final Operation operation;


    public CalculationAction(EntityDefinition entityDefinition, String resultProp, Operation operation) {
        super(ActionType.CALCULATION, entityDefinition);
        this.resultProp = resultProp;
        this.operation = operation;
    }

    public String getResultProp() {
        return resultProp;
    }

    public Operation getOperation() {
        return operation;
    }

    @Override
    public void invoke(Context context) {
        PropertyType propertyType = context.getPrimaryEntityInstance().getPropertyByName(resultProp).getPropertyDefinition().getType();
        ExpressionCalculator expressionCalculatorArg1 = new ExpressionCalculator(operation.getArg1Experssion(), context, propertyType);
        ExpressionCalculator expressionCalculatorArg2 = new ExpressionCalculator(operation.getArg2Experssion(), context, propertyType);

        Float arg1 = Float.parseFloat(expressionCalculatorArg1.calculate().toString());
        Float arg2 = Float.parseFloat(expressionCalculatorArg2.calculate().toString());
        Float result = null;

        switch (operation.getOperation()) {
            case "multiply":
                result = arg1 * arg2;
                break;
            case "divide":
                result = arg1 / arg2;
                break;
            default:
                throw new IllegalArgumentException("opertation" + operation.getOperation() + "can't operate on a none number property " + resultProp);
        }
        switch (propertyType) {
            case DECIMAL:
                Integer resultInt = Integer.parseInt(result.toString());
                context.getPrimaryEntityInstance().getPropertyByName(resultProp).updateValue(resultInt);
                break;
            case FLOAT:
                context.getPrimaryEntityInstance().getPropertyByName(resultProp).updateValue(result);
                break;
            default:
                throw new IllegalArgumentException("opertation" + operation.getOperation() + "can't operate on a none number property " + resultProp);
        }
    }
}
