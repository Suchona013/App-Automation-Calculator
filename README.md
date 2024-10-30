# App-Automation-Calculator

## Technology and Tools used
- Language: Java
- Test Framework: TestNG
- Build Tool: Gradle
- Automation Tool: Appium
- Reporting: Extent Reports
- IDE (IntelliJ IDEA)

## Prerequisites
Install the followings
- JDK (https://www.geeksforgeeks.org/download-and-install-java-development-kit-jdk-on-windows-mac-and-linux/)
- IDE (IntelliJ IDEA/ Eclipse)
- Node.js (https://www.geeksforgeeks.org/installation-of-node-js-on-windows/)
- Android Studio (Android SDK)
- Vysor (If want to run script in real device and screen mirroring)
- Appium
- Appium Inspector
 
## Scenario of the Project
Basic Operations of Calculator
- Addition
- Subtraction
- Multiplication
- Division

## How to run the project
- Clone the project
- Open the project in your preferred IDE (IntelliJ IDEA, Eclipse).
- Ensure the DesiredCapabilities in the Setup class match your device/emulator configurations. Update them if necessary:

      capabilities.setCapability("appium:udid", "<Your_Device_UDID>");
      capabilities.setCapability("appium:platformVersion", "<Your_Device_Android_Version>");
  
- Start the Appium server from the command line from the terminal of the editor:
  
      appium --use-plugins=execute-driver --base-path /wd/hub

- Run the "CalculatorTest" file 

## Output Screenshot
Reports
![image](https://github.com/user-attachments/assets/cd02f884-5f7c-4662-922e-8e7babba4d32)

![image](https://github.com/user-attachments/assets/342e6054-d569-4d5f-bdaa-5263e2363c2e)


