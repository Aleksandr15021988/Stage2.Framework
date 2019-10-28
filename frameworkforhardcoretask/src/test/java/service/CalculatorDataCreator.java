package service;

import model.CalculatorData;
public class CalculatorDataCreator {

    public static final String TESTDATA_VALUE_OPERATING_SYSTEM = "testdata.ValueOperatingSystem";
    public static final String TESTDATA_VALUE_MACHINE_CLASS ="testdata.ValueMachineClass";
    public static final String TESTDATA_VALUE_MACHINE_TYPE ="testdata.ValueMachineType";
    public static final String TESTDATA_VALUE_NUMBER_OF_GPU="testdata.ValueNumberOfGPU";
    public static final String TESTDATA_VALUE_GPUTYPE="testdata.ValueGPUType";
    public static final String TESTDATA_VALUE_LOCAL_SSD="testdata.ValueLocalSSD";
    public static final String TESTDATA_VALUE_DATACENTER_LOCATION="testdata.ValueDatacenterLocation";
    public static final String TESTDATA_VALUE_COMMITED_USAGE="testdata.ValueCommitedUsage";


    public static CalculatorData withCredentialsFromProperty(){
        return new CalculatorData(TestDataReader.getTestData(TESTDATA_VALUE_OPERATING_SYSTEM),
                TestDataReader.getTestData(TESTDATA_VALUE_MACHINE_CLASS),
                TestDataReader.getTestData(TESTDATA_VALUE_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_VALUE_NUMBER_OF_GPU),
                TestDataReader.getTestData(TESTDATA_VALUE_GPUTYPE),
                TestDataReader.getTestData(TESTDATA_VALUE_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_VALUE_DATACENTER_LOCATION),
                TestDataReader.getTestData(TESTDATA_VALUE_COMMITED_USAGE));
    }
}
