package com.packtpub.e4.clock.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


public class ClockView extends ViewPart {
	@Override
	public void createPartControl(Composite parent) {
		RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		parent.setLayout(layout);
		final ClockWidget clock1 = new ClockWidget(parent, SWT.NONE);
		clock1.initWidget();
		clock1.startClock();
		
		final ClockWidget clock2 = new ClockWidget(parent, SWT.NONE);
		clock2.initWidget();
		clock2.startClock();
		
		final ClockWidget clock3 = new ClockWidget(parent, SWT.NONE);
		clock3.initWidget();
		clock3.startClock();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}