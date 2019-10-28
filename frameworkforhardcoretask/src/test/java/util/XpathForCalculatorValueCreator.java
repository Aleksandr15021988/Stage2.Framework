package util;


import model.CalculatorData;

import service.CalculatorDataCreator;

public class XpathForCalculatorValueCreator {

    private CalculatorData calculatorData= CalculatorDataCreator.withCredentialsFromProperty();
    private String commonsXpathElementsForCalculatorValue ="/md-select-menu/md-content/md-option/div[contains(text(),'";

    public  String getXpathLocatorForValueOfOperatingSystem(){
        return "/"+ commonsXpathElementsForCalculatorValue +
                calculatorData.getValueOfOperatingSystem()
                +"')]";
}
    public String getXpathLocatorForValueOfMachineClass(){
        return  "//div[4]"+ commonsXpathElementsForCalculatorValue +
                calculatorData.getValueOfMachineClass()
                +"')]";
}
    public String getXpathLocatorForValueOfMachineType(){
        return "/"+ commonsXpathElementsForCalculatorValue.substring(26)+
                calculatorData.getValueOfMachineType()
                +"')]";
    }
    public String getXpathLocatorForValueOfNumberOfGPU(){
        return "//div[6]"+ commonsXpathElementsForCalculatorValue +
                calculatorData.getValueOfNumberOfGPUs()
                +"')]";
    }
    public String getXpathLocatorForValueOfGPUType(){
        return "//div[7]"+ commonsXpathElementsForCalculatorValue +
                calculatorData.getValueOfGPUType()
                +"')]";
    }
    public String getXpathLocatorForValueOfLocalSSD(){
        return "//div[8]"+ commonsXpathElementsForCalculatorValue +
                calculatorData.getValueOfLocalSSD()
                +"')]";
    }
    public String getXpathLocatorForValueOfDatacenterLocation(){
        return "//div[9]"+ commonsXpathElementsForCalculatorValue +
                calculatorData.getValueOfDatacenterLocation()
                +"')]";
    }
    public String getXpathLocatorForValueOfCommitedUsage(){
        return "//div[10]"+ commonsXpathElementsForCalculatorValue
                +calculatorData.getValueOfCommitedUsage()
                +"')]";
    }
}
