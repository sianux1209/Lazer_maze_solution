import javax.swing.JLabel;

/**
 * Token direction configuration
 *
 */
public class Direction {

	public enum Type{
		UP,
		RIGHT,
		DOWN,
		LEFT
	}
	
	private Type direction;
	
	/**
	 * token right
	 * 
	 * @param gameBoard
	 */
	public void turnRight(GameBoard gameBoard){
		
		RotatedIcon rotatedIcon = new RotatedIcon(gameBoard.getSelectedLabel().getIcon(), RotatedIcon.Rotate.UP);
		gameBoard.getSelectedLabel().setIcon(rotatedIcon);
		
		try{
		
			if(gameBoard.getSelectedLabel().getName().equals("UP")){
				gameBoard.getSelectedLabel().setName("RIGHT");
			}
			else if(gameBoard.getSelectedLabel().getName().equals("RIGHT")){
				gameBoard.getSelectedLabel().setName("DOWN");
			}
			else if(gameBoard.getSelectedLabel().getName().equals("DOWN")){
				gameBoard.getSelectedLabel().setName("LEFT");
			}
			else if(gameBoard.getSelectedLabel().getName().equals("LEFT")){
				gameBoard.getSelectedLabel().setName("UP");
			}
		}catch(NullPointerException e){}
		
	} // finish turn Right
	
	/**
	 * token left rotate
	 * 
	 * @param gameBoard
	 */
	public void turnLeft(GameBoard gameBoard){
		
		RotatedIcon rotatedIcon = new RotatedIcon(gameBoard.getSelectedLabel().getIcon(), RotatedIcon.Rotate.UP);
		gameBoard.getSelectedLabel().setIcon(rotatedIcon);
		
		try{
			if(gameBoard.getSelectedLabel().getName().equals("UP")){
				gameBoard.getSelectedLabel().setName("LEFT");
			}
			else if(gameBoard.getSelectedLabel().getName().equals("LEFT")){
				gameBoard.getSelectedLabel().setName("DOWN");
			}
			else if(gameBoard.getSelectedLabel().getName().equals("DOWN")){
				gameBoard.getSelectedLabel().setName("RIGHT");
			}
			else if(gameBoard.getSelectedLabel().getName().equals("RIGHT")){
				gameBoard.getSelectedLabel().setName("UP");
			}
		}
		catch(NullPointerException e){}
		
	} // finish turn right
	
} // end Direction class


//