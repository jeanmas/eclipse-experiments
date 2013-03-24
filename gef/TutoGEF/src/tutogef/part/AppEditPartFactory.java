package tutogef.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import tutogef.model.Employee;
import tutogef.model.Enterprise;
import tutogef.model.Service;

public class AppEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		AbstractGraphicalEditPart editPart = null;
		if(model instanceof Enterprise) {
			editPart = new EnterprisePart();
		} else if (model instanceof Employee) {
			editPart = new EmployeePart();
		} else if (model instanceof Service) {
			editPart = new ServicePart();
		}
		
		if(editPart != null) {
			editPart.setModel(model);
		}
		return editPart;
	}

}
