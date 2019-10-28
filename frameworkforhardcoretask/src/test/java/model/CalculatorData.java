package model;

public class CalculatorData {

    private String ValueOfOperatingSystem;
    private String ValueOfMachineClass;
    private String ValueOfMachineType;
    private String ValueOfNumberOfGPUs;
    private String ValueOfGPUType;
    private String ValueOfLocalSSD;
    private String ValueOfDatacenterLocation;
    private String ValueOfCommitedUsage;


    public CalculatorData(String valueOfOperatingSystem, String valueOfMachineClass, String valueOfMachineType,
                          String valueOfNumberOfGPUs, String valueOfGPUType, String valueOfLocalSSD,
                          String valueOfDatacenterLocation, String valueOfCommitedUsage){
        ValueOfOperatingSystem = valueOfOperatingSystem;
        ValueOfMachineClass = valueOfMachineClass;
        ValueOfMachineType = valueOfMachineType;
        ValueOfNumberOfGPUs = valueOfNumberOfGPUs;
        ValueOfGPUType = valueOfGPUType;
        ValueOfLocalSSD = valueOfLocalSSD;
        ValueOfDatacenterLocation = valueOfDatacenterLocation;
        ValueOfCommitedUsage = valueOfCommitedUsage;
    }

    public String getValueOfOperatingSystem() {
        return ValueOfOperatingSystem;
    }

    public String getValueOfMachineClass() {
        return ValueOfMachineClass;
    }

    public String getValueOfMachineType() {
        return ValueOfMachineType;
    }

    public String getValueOfNumberOfGPUs() {
        return ValueOfNumberOfGPUs;
    }

    public String getValueOfGPUType() {
        return ValueOfGPUType;
    }

    public String getValueOfLocalSSD() {
        return ValueOfLocalSSD;
    }

    public String getValueOfDatacenterLocation() {
        return ValueOfDatacenterLocation;
    }

    public String getValueOfCommitedUsage() {
        return ValueOfCommitedUsage;
    }


}
