package Laba2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;



public class Gui{
	public static Shell ConfigureShell(Display display) {
		Zoo z = new Zoo();
	    Ostrich o = new Ostrich(true,true,true,"Strays");
	    Elephant e = new Elephant(true,true,true,true, "Slon");
	    Employee emp = new Employee(e,o);
	    
	    z.setEmployee(emp);
	    
		Shell shell = new Shell(display, SWT.SHELL_TRIM & (~SWT.RESIZE));
		shell.setText("Find out remainder and quotient");
		shell.setSize(480, 120);
		shell.setLayout(new GridLayout(3, true));
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
				
		
		Button feedToOstrich = new Button(shell, SWT.PUSH);
		feedToOstrich.setText("Кормить страуса");
		feedToOstrich.setLayoutData(gridData);
		Button clearToOstrich = new Button(shell, SWT.PUSH);
		clearToOstrich.setText("Чистить страуса");
		clearToOstrich.setLayoutData(gridData);
		Label ostrichLabel = new Label(shell, SWT.LEFT);
		ostrichLabel.setText("Страус: ");
		
		Button feedToElephant = new Button(shell, SWT.PUSH);
		feedToElephant.setText("Кормить слона");
		feedToElephant.setLayoutData(gridData);
		Button clearToElephant = new Button(shell, SWT.PUSH);
		clearToElephant.setText("Чистить слона");
		clearToElephant.setLayoutData(gridData);
		Label elephantLabel = new Label(shell, SWT.LEFT);
		elephantLabel.setText("Слон: ");
		
		feedToOstrich.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event)
		       {
		    	
		    	ostrichLabel.setText("Страус: " + z.getEmployee().feed(1));
		    	ostrichLabel.getParent().layout();
		}
		});
		
		feedToElephant.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event)
		       {
		    	elephantLabel.setText("Слон: " + z.getEmployee().feed(0));
		    	elephantLabel.getParent().layout();
		    	
		}
		});
		
		clearToOstrich.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event)
		       {
		    	ostrichLabel.setText("Страус: " + z.getEmployee().clean(1));
		    	ostrichLabel.getParent().layout();
		    	
		}
		});
		
		clearToElephant.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event)
		       {
		    	elephantLabel.setText("Слон: " + z.getEmployee().clean(0));
		    	elephantLabel.getParent().layout();
		    	
		}
		});
		
		return shell;

		}

		public static void main(String[] args) {
		Display display = new Display();
		Shell shell = ConfigureShell(display);
		shell.open();
		while (!shell.isDisposed())
		{
			if (!display.readAndDispatch())
		    display.sleep();
		}

	    }
}