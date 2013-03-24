package tutogef;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class MyEditorInput implements IEditorInput {

	private String name = null;

	public MyEditorInput(String name) {
		this.name = name;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		return this.name != null;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return this.getName();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MyEditorInput)) {
			return false;
		}
		return ((MyEditorInput) obj).getName().equals(getName());
	}
}
