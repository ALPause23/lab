package GUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import Zoopark.Elephant;
import Zoopark.Employee;
import Zoopark.Ostrich;
import Zoopark.Flamingo;
import Zoopark.Tiget;
import Zoopark.Zoo;
import MainProg.People;

public class Gui{
	public static Shell ConfigureShell(Display display) {
		
		Elephant elephant = new Elephant(true, true, true, true, "Slon");
		Ostrich ostrich = new Ostrich(true, true, true, "Strays");
		Flamingo flamingo = new Flamingo(true, true, true, "Flamingo");
		Tiget tiger = new Tiget(true, true, true, "Tiger", "black");
		Employee employee = new Employee(elephant, ostrich);
		Zoo zoo = new Zoo(4);
		People people = new People(zoo);
	    	    
		Shell shell = new Shell(display, SWT.SHELL_TRIM & (~SWT.RESIZE));
		shell.setText("Find out remainder and quotient");
		shell.setSize(480, 160);
		shell.setLayout(new GridLayout(3, true));
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		
		Button feedToOstrich = new Button(shell, SWT.PUSH);
		feedToOstrich.setText("Feed the ostrich");
		feedToOstrich.setLayoutData(gridData);
		Button clearToOstrich = new Button(shell, SWT.PUSH);
		clearToOstrich.setText("To clean ostrich");
		clearToOstrich.setLayoutData(gridData);
		Label ostrichLabel = new Label(shell, SWT.LEFT);
		ostrichLabel.setText("Ostrich: ");
		Button feedToElephant = new Button(shell, SWT.PUSH);
		feedToElephant.setText("Feed the elephant");
		feedToElephant.setLayoutData(gridData);
		Button clearToElephant = new Button(shell, SWT.PUSH);
		clearToElephant.setText("To clean elephant");
		clearToElephant.setLayoutData(gridData);
		Label elephantLabel = new Label(shell, SWT.LEFT);
		elephantLabel.setText("Elephant: ");
		Button randomAnimal = new Button(shell, SWT.PUSH);
		randomAnimal.setText("Random animal");
		randomAnimal.setLayoutData(gridData);
		Label randomAni = new Label(shell, SWT.LEFT);
				
		zoo.setAnimals(elephant, 0);
		zoo.setAnimals(ostrich, 1);
		zoo.setAnimals(tiger, 2);
		zoo.setAnimals(flamingo, 3);
				
		feedToOstrich.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event){
		    	ostrichLabel.setText("Ostrich: " + employee.feed(1));
		    	ostrichLabel.getParent().layout();
		    }
		});
		feedToElephant.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event){
		    	elephantLabel.setText("Elephant: " + employee.feed(0));
		    	elephantLabel.getParent().layout();
		    }
		});
		clearToOstrich.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event){
		    	ostrichLabel.setText("Ostrich: " + employee.clean(1));
		    	ostrichLabel.getParent().layout();
		    }
		});
		clearToElephant.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event){
		    	elephantLabel.setText("Elephant: " + employee.clean(0));
		    	elephantLabel.getParent().layout();
		    }
		});
		randomAnimal.addListener(SWT.Selection, new Listener()
		{
		    public void handleEvent(Event event){
		    	randomAni.setText(people.seeAnimal());
		    	randomAni.getParent().layout();
		    }
		});
		return shell;
    }

		public static void main(String[] args) {
			Display display = new Display();
			Shell shell = ConfigureShell(display);
			shell.open();
			while (!shell.isDisposed()){
				if (!display.readAndDispatch()){
					display.sleep();
				}
			}
		}
}
