package com.packtpub.e4.clock.ui.views;

import java.util.Calendar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class ClockWidget extends Canvas {

	private volatile boolean clockStarted = false;
	private boolean widgetInitted = false;

	public ClockWidget(Composite parent, int style) {
		super(parent, style);
	}

	public void initWidget() {
		if(widgetInitted) {
			return;
		}
		widgetInitted = true;
		this.addPaintListener(new PaintListener() {

			@Override
			public void paintControl(PaintEvent e) {
				ClockWidget.this.paintControl(e);
			}
		});
	}

	public void paintControl(PaintEvent e) {
		int seconds = Calendar.getInstance().get(Calendar.SECOND);
		int arc = (15 - seconds) * 6 % 360;
		Color blue = e.display.getSystemColor(SWT.COLOR_BLUE);
		e.gc.setBackground(blue);
		e.gc.fillArc(e.x, e.y, e.width - 1, e.height - 1, arc - 1, 2);
		e.gc.drawOval(e.x, e.y, e.width - 1, e.height - 1);
	}

	public void startClock() {
		if (!clockStarted) {
			clockStarted = true;
			new Thread("TickToc") {
				public void run() {
					while (!ClockWidget.this.isDisposed()) {
						ClockWidget.this.getDisplay().asyncExec(new Runnable() {
							public void run() {
								if (ClockWidget.this != null
										&& !ClockWidget.this.isDisposed()) {
									ClockWidget.this.redraw();
								}
							}
						});
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
			}.start();
		}
	}
	
	@Override
	public Point computeSize(int wHint, int hHint, boolean changed) {
		int size;
		
		if(wHint == SWT.DEFAULT) {
			size = hHint;
		}
		else if(hHint == SWT.DEFAULT) {
			size = wHint;
		}
		else {
			size = Math.min(wHint, hHint);
		}
		
		if(size == SWT.DEFAULT) {
			size = 90;
		}
		return new Point(size, size);
	}
	
	@Override
	public Point computeSize(int wHint, int hHint) {
		return computeSize(wHint, hHint, true);
	}

}
