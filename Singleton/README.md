The Singleton pattern is a creational design pattern in Object-Oriented Programming (OOP) that ensures a class has only one instance and provides a global point of access to that instance.

```java
class Logger {
	private static Logger instance;
	
	private Logger() {
		sout("Logger initilized");
	}
	
	public static Logger getInstance() {
		if (instance == null){
			instance = new Logger();
		}
		return instance;
	}
	
	 public void log(String message) {
	   System.out.println("Log message: " + message);
   }
}

```