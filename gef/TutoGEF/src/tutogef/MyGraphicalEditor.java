package tutogef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

import tutogef.model.Enterprise;
import tutogef.part.AppEditPartFactory;

public class MyGraphicalEditor extends GraphicalEditor {

	public static final String ID = "tutogef.mygraphicaleditor";
	
	public MyGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void initializeGraphicalViewer() {
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setContents(createEnterprise());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}
	
	private Enterprise createEnterprise() {
		Enterprise enterprise = new Enterprise();
		enterprise.setName("Alpha enterprises");
		enterprise.setAddress("World Trade Center, Manhattan");
		enterprise.setCapital(100000);
		return enterprise;
	}
	
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new AppEditPartFactory());
	}
}
