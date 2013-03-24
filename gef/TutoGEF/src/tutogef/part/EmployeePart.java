package tutogef.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import tutogef.figure.EmployeeFigure;
import tutogef.model.Employee;
import tutogef.model.Node;

public class EmployeePart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		IFigure figure = new EmployeeFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}
	
	@Override
	protected void refreshVisuals() {
		Employee model = (Employee)getModel();
		EmployeeFigure figure = (EmployeeFigure)getFigure();
		
		figure.setName(model.getName());
		figure.setFirstName(model.getFirstName());
		figure.setLayout(model.getLayout());
	}
	
	@Override
	public List<Node> getModelChildren() {
		return Collections.emptyList();
	}
}
