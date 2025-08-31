package code;

public class MultipleWindows {
    public static void main(String[] args) {

    }
    String mainWindow = driver.getWindowhandles();
    Set <String> allWindow = driver.getWindowhandles();

    for (String window : allWindow){
        if (!mainWindow.equals(window)){
            driver.switchTo().window(window);
        }
    }
}
