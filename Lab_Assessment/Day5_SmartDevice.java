package classPractice;


interface Controllable 
{
	 void turnOn();
	 void turnOff();
	
	 default void status() {
	     System.out.println("Device status: Operational");
	 }
	
	 static void deviceInfo() {
	     System.out.println("All smart devices are controllable and IoT-enabled.");
	 }
}

abstract class SmartDevice implements Controllable {
	 protected String deviceName;
	
	 SmartDevice(String deviceName) {
	     this.deviceName = deviceName;
	 }
	
	 public void showDeviceName() {
	     System.out.println("Device: " + deviceName);
	 }
}


class SmartLight extends SmartDevice {
	 SmartLight(String deviceName) {
	     super(deviceName);
	 }
	
	 @Override
	 public void turnOn() {
	     System.out.println(deviceName + " Light is turned ON.");
	 }
	
	 @Override
	 public void turnOff() {
	     System.out.println(deviceName + " Light is turned OFF.");
	 }
}


class SmartFan extends SmartDevice {
	 SmartFan(String deviceName) {
	     super(deviceName);
	 }
	
	 @Override
	 public void turnOn() {
	     System.out.println(deviceName + " Fan is turned ON.");
	 }
	
	 @Override
	 public void turnOff() {
	     System.out.println(deviceName + " Fan is turned OFF.");
	 }
}

public class Day5_SmartDevice
{
 public static void main(String[] args) {
     Controllable.deviceInfo();
     System.out.println();

     SmartLight light = new SmartLight("Philips");
     light.showDeviceName();
     light.turnOn();
     light.status();
     light.turnOff();

     System.out.println();

     SmartFan fan = new SmartFan("Orient");
     fan.showDeviceName();
     fan.turnOn();
     fan.status();
     fan.turnOff();
 }
}

