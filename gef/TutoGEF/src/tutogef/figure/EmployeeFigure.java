package tutogef.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;

public class EmployeeFigure extends Figure {
	private Label labelName = new Label();
	private Label labelFirstName = new Label();
	
	public EmployeeFigure() {
		ToolbarLayout layout = new ToolbarLayout();
		
	}
	
	public void setName(String name) {
		labelName.setText(name);
	}
	
	public void setFirstName(String firstName) {
		labelFirstName.setText(firstName);
	}
}
