import HelloWorldController.HelloWorldController;
import HelloWorldModel.HelloWorldModel;
import HelloWorldView.HelloWorldView;

public class Main {

	public static void main(String[] args) {

		HelloWorldModel model = new HelloWorldModel();
		HelloWorldView view = new HelloWorldView();
		HelloWorldController controller = new HelloWorldController(model, view);
		
		view.setVisible(true);

	}

}
