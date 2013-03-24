package tutogef.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class EmployeeFigure extends Figure {
	private Label labelName = new Label();
	private Label labelFirstName = new Label();
	
	public EmployeeFigure() {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		
		labelName.setForegroundColor(ColorConstants.darkGray);
		add(labelName, ToolbarLayout.ALIGN_CENTER);
		
		labelFirstName.setForegroundColor(ColorConstants.darkGray);
		add(labelFirstName, ToolbarLayout.ALIGN_CENTER);
		
		setBorder(new LineBorder(1));
		setOpaque(true);
	}
	
	public void setName(String name) {
		labelName.setText(name);
	}
	
	public void setFirstName(String firstName) {
		labelFirstName.setText(firstName);
	}
	
	public void setLayout(Rectangle rect) {
		getParent().setConstraint(this, rect);
	}
}
