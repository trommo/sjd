package info.sjd;


import java.util.List;
import java.util.logging.Logger;


import info.sjd.service.ShapeService;

public class AppRunnerCollection {
	
	private static Logger logger = Logger.getLogger(AppRunnerCollection.class.getName());
	
	public static void main(String[] args) {
		
		List<Shape> shapes = ShapeService.getRandomShapeList();
		
		// Finding the minimal and maximal elements of collection
				
		Shape maxElement = ShapeService.getMaxSquareShape(shapes);
		Shape minElement = ShapeService.getMinSquareShape(shapes);
		
		if (minElement != null) {
			logger.info("The minimal square object is " + minElement.getClass().getSimpleName() + ", its square equals to " + minElement.toString() + ".");
		}

		if (maxElement != null) {
			logger.info("The maximum square object is " + maxElement.getClass().getSimpleName() + ", its square equals to " + maxElement.toString() + ".");
		}
	}
}
