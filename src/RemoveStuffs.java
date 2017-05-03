/*
 * the public class "RemoveStuffs" inherits frame from "ShowCaseGUI" class
 */
public class RemoveStuffs extends ShowCaseGUI {
	
/*
 * public void because it has to be called, therefore this must be global
 * arguments are component types which exist because we imported the java.awt package
 * i, j, k, s are just argument names
 */
	public void removeAllStuff(java.awt.Component i, java.awt.Component j, java.awt.Component k, java.awt.Component s)  {
		/*
		 * setVisible(false) hides the component in the GUI however it does not delete the component
		 * again we must get the content pane from the frame
		 * the content pane contains all of our components
		 * then we remove the components from the content pane
		 */
		
		i.setVisible(false);
		j.setVisible(false);
		k.setVisible(false);
		s.setVisible(false);
		frame.getContentPane().remove(i);
		frame.getContentPane().remove(j);
		frame.getContentPane().remove(k);
		frame.getContentPane().remove(s);
		System.out.print(frame.getContentPane().getComponentAt(162, 155));
	}

}

/*Side note: the frame contains the content pane and the content pane is its own container which can be manipulated and have components added to it
 * The reason why I didn't use frame.remove() is because I want to keep the content pane so I can change it to the actual program content
 */