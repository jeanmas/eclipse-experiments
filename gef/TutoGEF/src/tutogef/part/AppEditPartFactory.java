package tutogef.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import tutogef.model.Enterprise;

public class AppEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		AbstractGraphicalEditPart editPart = null;
		if(model instanceof Enterprise) {
			editPart = new EnterprisePart();
		}
		if(editPart != null) {
			editPart.setModel(model);
		}
		return editPart;
	}

}
