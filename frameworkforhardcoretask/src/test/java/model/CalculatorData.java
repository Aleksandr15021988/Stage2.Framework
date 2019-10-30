package model;

public class CalculatorData {

    private String valueOfOperatingSystem;
    private String valueOfMachineClass;
    private String valueOfMachineType;
    private String valueOfNumberOfGPUs;
    private String valueOfGPUType;
    private String valueOfLocalSSD;
    private String valueOfDatacenterLocation;
    private String valueOfCommitedUsage;


    public CalculatorData(String valueOfOperatingSystem, String valueOfMachineClass, String valueOfMachineType,
                          String valueOfNumberOfGPUs, String valueOfGPUType, String valueOfLocalSSD,
                          String valueOfDatacenterLocation, String valueOfCommitedUsage){
        this.valueOfOperatingSystem = valueOfOperatingSystem;
        this.valueOfMachineClass = valueOfMachineClass;
        this.valueOfMachineType = valueOfMachineType;
        this.valueOfNumberOfGPUs = valueOfNumberOfGPUs;
        this.valueOfGPUType = valueOfGPUType;
        this.valueOfLocalSSD = valueOfLocalSSD;
        this.valueOfDatacenterLocation = valueOfDatacenterLocation;
        this.valueOfCommitedUsage = valueOfCommitedUsage;
    }

    public String getValueOfOperatingSystem() {
        return valueOfOperatingSystem;
    }

    public String getValueOfMachineClass() {
        return valueOfMachineClass;
    }

    public String getValueOfMachineType() {
        return valueOfMachineType;
    }

    public String getValueOfNumberOfGPUs() {
        return valueOfNumberOfGPUs;
    }

    public String getValueOfGPUType() {
        return valueOfGPUType;
    }

    public String getValueOfLocalSSD() {
        return valueOfLocalSSD;
    }

    public String getValueOfDatacenterLocation() {
        return valueOfDatacenterLocation;
    }

    public String getValueOfCommitedUsage() {
        return valueOfCommitedUsage;
    }


}
