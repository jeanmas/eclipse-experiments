package tutogef.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

public class Node {
	private String name;
	private Rectangle layout;
	private List<Node> children;
	private Node parent;
	
	
	public Node() {
		this.name = "UNKNOWN";
		this.layout = new Rectangle(10, 10, 100, 100);
		this.children = new ArrayList<Node>();
		this.parent = null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Rectangle getLayout() {
		return layout;
	}


	public void setLayout(Rectangle layout) {
		this.layout = layout;
	}


	public Node getParent() {
		return parent;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public boolean addChild(Node child) {
		child.setParent(this);
		return children.add(child);
	}
	
	public boolean removeChild(Node child) {
		return children.remove(child);
	}
	
	public List<Node> getChildren() {
		return Collections.unmodifiableList(children);
	}
	
}
