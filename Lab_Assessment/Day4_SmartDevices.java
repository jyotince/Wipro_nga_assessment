package classPractice;

interface Controllable {
	 void turnOn();
	 void turnOff();
	 
	 default void status() {
	     System.out.println("Device status: Unknown.");
	 }

	 static void deviceInfo() {
	     System.out.println("Controllable : Used for all smart devices.");
	 }
}

class SmartLight implements Controllable {
	 private String name;
	 private boolean isOn;
	
	 SmartLight(String name) {
	     this.name = name;
	     this.isOn = false;
	 }
	
	 @Override
	 public void turnOn() {
	     isOn = true;
	     System.out.println(name + " light is ON.");
	 }
	
	 @Override
	 public void turnOff() {
	     isOn = false;
	     System.out.println(name + " light is OFF.");
	 }
	
	 @Override
	 public void status() {
	     System.out.println(name + " light status: " + (isOn ? "ON" : "OFF"));
	 }
}

class SmartFan implements Controllable {
	 private String name;
	 private boolean isOn;
	
	 SmartFan(String name) {
	     this.name = name;
	     this.isOn = false;
	 }
	
	 @Override
	 public void turnOn() {
	     isOn = true;
	     System.out.println(name + " fan is ON.");
	 }
	
	 @Override
	 public void turnOff() {
	     isOn = false;
	     System.out.println(name + " fan is OFF.");
	 }
}

public class Day4_SmartDevices {
	 public static void main(String[] args) {
	    
	     SmartLight light = new SmartLight("Philips");
	     SmartFan fan = new SmartFan("Orient");
	
	     light.turnOn();
	     light.status();
	
	     fan.turnOn();
	     fan.status(); 
	    
	     Controllable.deviceInfo();
	 }
}

