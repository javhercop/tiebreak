package es.tecnoy.spring.entity;

public class Stage {

	private static Stage instance;
	private String lights;

	private Stage() {

		lights = "OFF";

	}

	public String getStatus() {
		return lights;
	}
	
	public void switchLights() {
		
		if(lights.equals("OFF")) {
			lights = "ON";
		}else {
			lights = "OFF";
		}
		
	}
	
	public void start() {
		System.out.println("Starting the stage "+getStatus());
	}
	
	public void end() {
		System.out.println("Closing the stage "+getStatus());
	}
	
	public static Stage getInstance() {

		if (instance == null) {
			instance = new Stage();
		}
		return instance;

	}
	

}
